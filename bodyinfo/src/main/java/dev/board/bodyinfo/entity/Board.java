package dev.board.bodyinfo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// jpa
@Entity

// lombok
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Board {
	@Id
	
	private String title; // 게시글 제목
	private String author; // 게시글 작성자
	private String content; // 게시글 내용
	private Date writeday; // 게시글 작성일자
	private int readcnt; // 게시글 조회수
	
	
	
	
}
