package com.spring.mvc2.service;

import java.util.List;

import com.spring.mvc2.dto.BoardDto;

public interface BoardService {

	public void insertBoard(BoardDto boardDto);
	public List<BoardDto> getBoardList();
	public BoardDto getOneBoard(int num);
	public boolean deleteBoard(BoardDto boardDto);
}
