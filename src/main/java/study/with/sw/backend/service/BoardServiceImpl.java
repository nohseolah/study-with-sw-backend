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
}
