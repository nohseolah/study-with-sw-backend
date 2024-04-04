package study.with.sw.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.with.sw.backend.config.ApiResponse;
import study.with.sw.backend.dto.BoardRequestDto;
import study.with.sw.backend.service.BoardService;

@RestController // 웹 페이지가 아니라 API로 응답한다
@RequiredArgsConstructor    // 필요한 생성자만 가져오겠다
@RequestMapping("/study1")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board")
    public ApiResponse readAll(){
        return boardService.readAll();
    }

    @PostMapping("/board")
    public ApiResponse create(@RequestBody BoardRequestDto boardRequestDto){
        return boardService.create(boardRequestDto);
    }

    @DeleteMapping("/board/{id}")    // PassParam url 경로에 있는 파라미터
    public ApiResponse delete(@PathVariable("id") Long id){
        return boardService.delete(id);
    }

    @PutMapping("/board")
    public ApiResponse update(@RequestBody BoardRequestDto boardRequestDto){
        return boardService.update(boardRequestDto);
    }
}
