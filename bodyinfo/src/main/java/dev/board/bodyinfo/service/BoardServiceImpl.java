package dev.board.bodyinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.board.bodyinfo.entity.Board;
import dev.board.bodyinfo.entity.Board.Request;
import dev.board.bodyinfo.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;

	@Override
	public List<Board> findallBoards() {
		return boardRepository.findAll();
	}

	@Override
	public Board findBoardById(Integer id) {
		Board searchedBoard = boardRepository.findById(id)
				.orElseThrow(() -> new RuntimeException(String.format("%s에 해당하는 Id가 존재하지 않습니다.", id)));
		return searchedBoard;
	}

	@Override
	public Board saveBoard(Board newBoard) {
		return boardRepository.save(newBoard);
	}

	@Override
	public List<Board> modifyBoard(Request request) {
		final Optional<Board> board = boardRepository.findById(request.getId());

		if (board.isPresent()) {
			final Board searchedBoard = board.get();

			searchedBoard.setTitle(request.getTitle());
			searchedBoard.setContent(request.getContent());

			boardRepository.save(searchedBoard);
		}

		List<Board> boards = boardRepository.findAll();
		return boards;
	}

	@Override
	public List<Board> deleteBoard(Integer id) {
		boardRepository.deleteById(id);

		List<Board> boards =  boardRepository.findAll();
		return boards;
	}

}
