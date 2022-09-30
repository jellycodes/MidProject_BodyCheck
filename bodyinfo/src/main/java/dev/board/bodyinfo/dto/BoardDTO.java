package dev.board.bodyinfo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//jpa
@Entity
@Table(name = "board")
//lombok
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class BoardDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title; // 게시글 제목
	private String author; // 게시글 작성자
	private String content; // 게시글 내용
	
	@Column(name = "write_day")
	private Date writeday; // 게시글 작성일자
	
	private Integer readcnt; // 게시글 조회수
}
