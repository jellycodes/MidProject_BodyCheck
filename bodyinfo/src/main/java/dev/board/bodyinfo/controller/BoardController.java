package dev.board.bodyinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.board.bodyinfo.repository.BoardRepository;
import dev.board.bodyinfo.service.BoardService;

@RestController
@RequestMapping("board") // board 컨트롤러
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardRepository bodyrepository;
	
	/**
	 * 	@return List<Board>
	 * 	@author jellycodes
	 */
	public 
}
