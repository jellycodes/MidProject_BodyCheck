package dev.board.bodyinfo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "boards")

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString
public class Board {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(nullable = false)
    private String title;

	@Column(nullable = false)
    private String content;

	
	@Builder
	@Getter @Setter 
	@ToString
	public static class Request {
		
		private Integer id;
		@NotBlank(message="제목을 입력해주세요")
		private String title;
		@NotBlank(message="내용을 입력해주세요")
		private String content;
		
		public static Board toEntity(final Request request) {
			return Board.builder()
					.id(request.getId())
					.title(request.getTitle())
					.content(request.getContent())
					.build();
		}
	}
	
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Getter @Setter @ToString
	public static class Response {
		private Integer id;
		private String title;
		private String content;
		
		public static Board.Response toResponse(final Board board) {
			return Response.builder()
					.id(board.getId())
					.title(board.getTitle())
					.content(board.getContent())
					.build();
		}
		
		public static List<Board.Response> toResponseList(final List<Board> boards) {
			List<Board.Response> list = new ArrayList<>();
			for (Board board : boards) {
				list.add(toResponse(board));
			}
			return list;
		}
	}
}
