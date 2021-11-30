package com.spring.mvc2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc2.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(BoardDto boardDto) {
		sqlSession.insert("mapper.BoardMapper77.insertBoard" , boardDto);
	}

	@Override
	public List<BoardDto> selectAll() {
		return sqlSession.selectList("mapper.BoardMapper77.getAllBoard");
	}

	@Override
	public BoardDto selectOne(int num) {
		return sqlSession.selectOne("mapper.BoardMapper77.getOneBoard" , num);
	}

	@Override
	public void delete(int num) {
		sqlSession.delete("mapper.BoardMapper77.deleteBoard" , num);
		
	}

	@Override
	public BoardDto validateUserCheck(BoardDto boardDto) {
		return sqlSession.selectOne("mapper.BoardMapper77.validateUserCheck", boardDto);
	}
	

}
