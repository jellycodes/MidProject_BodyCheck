package dev.board.bodyinfo.service;

import java.util.List;

import dev.board.bodyinfo.entity.Board;

public interface BoardService {
	List<Board> findAllBoards();
	
	Board findBoardById(String id);
}
