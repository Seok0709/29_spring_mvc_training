package com.spring.mvc2.dao;

import java.util.List;

import com.spring.mvc2.dto.BoardDto;

public interface BoardDao {

	public void insert(BoardDto boardDto);
	public List<BoardDto> selectAll();
	public BoardDto selectOne(int num);
	public BoardDto validateUserCheck(BoardDto boardDto);
	public void delete(int num);
}
