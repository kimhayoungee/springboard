package com.my.service;

import java.util.List;

import com.my.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> getBoardList();
	
	public String getNumber(); //채번 
	
	public int register(BoardVO bvo);
	
	public BoardVO showDetail(String bno);
	
	public int updateBoard(BoardVO bvo);
	
	public int deleteBoard(String bno);
	
}
