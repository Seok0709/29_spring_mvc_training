package com.spring.mvc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc2.dao.BoardDao;
import com.spring.mvc2.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	@Override
	public void insertBoard(BoardDto boardDto) {
		boardDao.insert(boardDto);
		
	}
	@Override
	public List<BoardDto> getBoardList() {
		return boardDao.selectAll();
	}
	@Override
	public BoardDto getOneBoard(int num) {
		return boardDao.selectOne(num);
	}
	@Override
	public boolean deleteBoard(BoardDto boardDto) {
		boolean isSucceed = false;
		
		if(boardDao.validateUserCheck(boardDto) != null) {
			boardDao.delete(boardDto.getNum());
			isSucceed = true;
		}
		return isSucceed;
	}

}
