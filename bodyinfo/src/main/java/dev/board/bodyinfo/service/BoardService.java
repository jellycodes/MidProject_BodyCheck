package dev.board.bodyinfo.service;

import java.util.List;

import dev.board.bodyinfo.entity.Board;

public interface BoardService {

	List<Board> findallBoards(); // 게시판 글 보기
	
	Board findBoardById(Integer id);
	
	Board saveBoard(Board newBoard); // 게시판 글 쓰기
	
	List<Board> modifyBoard(Board.Request request);
	
	List<Board> deleteBoard(Integer id); // 게시판 글 지우기
}
