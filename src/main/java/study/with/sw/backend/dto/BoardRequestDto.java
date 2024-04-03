package study.with.sw.backend.dto;

import lombok.Builder;
import lombok.Getter;
import study.with.sw.backend.entity.Board;

@Getter // 프론트에서 서버로 값을 담기 위해서
@Builder // entity에 값을 빌드하기 위해서(Dto에서 내가 필요한 값만 가져오기 위해서)
public class BoardRequestDto {
    private Long id;
    private Long authorId;
    private String title;
    private String content;
    private int views;

    public Board create() {
        return Board.builder()
                .title(title)
                .content(content)
                .authorId(authorId)
                .build();
    }
}
