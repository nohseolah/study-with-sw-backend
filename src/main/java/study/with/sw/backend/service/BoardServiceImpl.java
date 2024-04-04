package study.with.sw.backend.service;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.with.sw.backend.config.ApiResponse;
import study.with.sw.backend.dto.BoardRequestDto;
import study.with.sw.backend.entity.Board;
import study.with.sw.backend.repository.BoardRepository;

import java.util.List;
//서비스 임플: 서버에서 연산하는 것
@Service
@Slf4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
    private BoardRepository boardRepository;

    @Override
    @Description("게시물 전체 조회")
    public ApiResponse readAll() {
        return ApiResponse.success(boardRepository.findAll());
    }

    @Override
    public ApiResponse create(BoardRequestDto boardRequestDto) {
        return ApiResponse.success(boardRepository.save(boardRequestDto.create()));
    }

    @Override
    public ApiResponse delete(Long id) {
       // 특정 아이디를 가진 게시물을 삭제
        boardRepository.deleteById(id);
        // API 성공 응답 내리기
        return ApiResponse.ok();
    }

    @Override
    public ApiResponse update(BoardRequestDto boardRequestDto) {
        return ApiResponse.success(boardRepository.save(boardRequestDto.update()));
    }


}
