package dev.board.bodyinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.board.bodyinfo.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
}
