package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.BoardVO;
import com.my.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int register(BoardVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO showDetail(String bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateBoard(BoardVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(String bno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
