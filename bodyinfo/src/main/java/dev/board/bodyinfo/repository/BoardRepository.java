package dev.board.bodyinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.board.bodyinfo.dto.BoardDTO;

@Repository
public interface BoardRepository extends JpaRepository<BoardDTO, Integer>{

}
