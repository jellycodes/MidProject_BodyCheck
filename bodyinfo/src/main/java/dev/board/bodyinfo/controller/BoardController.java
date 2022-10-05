package dev.board.bodyinfo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.board.bodyinfo.entity.Board;
import dev.board.bodyinfo.repository.BoardRepository;
import dev.board.bodyinfo.service.BoardService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/boards")
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepository;

	@Autowired
	private BoardService boardService;
	
	@GetMapping
	 public List<Board.Response> listBoards(){
		
		List<Board> boards = boardService.findallBoards();
		List<Board.Response> response = Board.Response.toResponseList(boards);
		return response;
	}
	
	@PostMapping
	public Board.Response wirteBoard(@RequestBody @Valid Board.Request request) {
		Board board = Board.Request.toEntity(request);
		Board savedBoard = boardService.saveBoard(board);
		return Board.Response.toResponse(savedBoard);
	
	}
	
//	@GetMapping
//	public void findByTitleContaining() {
//		
//		Collection<Board> searchedBoard = boardRepository.findByTitleContaining("제");
//		searchedBoard.forEach(board -> System.out.println(board));
//		
//	}
	
	@GetMapping("/{id}")
	public Board.Response searchBoard(@PathVariable Integer id) {
		Board searchedBoard = boardService.findBoardById(id);
		return Board.Response.toResponse(searchedBoard);
	}
	
	@PutMapping
	public List<Board.Response> modifyBoard(@RequestBody Board.Request request) {
		List<Board> boards = boardService.modifyBoard(request);
		return Board.Response.toResponseList(boards);
	}
	
	@DeleteMapping
	public List<Board.Response> deleteBoard(@RequestParam("id") Integer id) {
		List<Board> boards = boardService.deleteBoard(id);
		return Board.Response.toResponseList(boards);
	}
}










