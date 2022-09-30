package dev.board.bodyinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import dev.board.bodyinfo.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	
}
