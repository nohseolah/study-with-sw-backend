package study.with.sw.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.with.sw.backend.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
