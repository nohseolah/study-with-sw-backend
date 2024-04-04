package study.with.sw.backend.service;

import study.with.sw.backend.config.ApiResponse;
import study.with.sw.backend.dto.BoardRequestDto;

public interface BoardService {

    ApiResponse readAll();

    ApiResponse create(BoardRequestDto boardRequestDto);

    ApiResponse delete(Long id);

    ApiResponse update(BoardRequestDto boardRequestDto);
}
