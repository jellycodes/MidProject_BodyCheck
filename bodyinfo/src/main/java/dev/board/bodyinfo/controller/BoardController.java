package dev.board.bodyinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.board.bodyinfo.entity.Board;
import dev.board.bodyinfo.repository.BoardRepository;
import dev.board.bodyinfo.service.BoardService;

@RestController
@RequestMapping("boards") // board 컨트롤러

@CrossOrigin(origins = "*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardRepository boardrepository;
	
	/**
	 * 	@return List<Board>
	 * 	@author jellycodes
	 */
	
	@GetMapping("/boards")
	public ResponseEntity<List<Board>> getAllBoards(){
	}
	
	
	
}
