package com.my.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Configuration;

import com.my.domain.BoardVO;

public interface BoardMapper {

	public List<BoardVO> selectWholeList();
	
	public String getNumber(); //채번 
	
	public int insertBoard(BoardVO bvo);
	
	public BoardVO selectDetail(String bno);
	
	public int updateBoard(BoardVO bvo);
	
	public int deleteBoard(String bno);
	
} //end of BoardMapper
