package com.my.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
	public void testGetBoardList() {
		mapper.getBoardList().forEach(board -> log.info(board));
	}

	@Test
	public void testGetNumber() {
		log.info(mapper.getNumber());
	}
	
//	@Test 
	public void testRegister() {
		
		BoardVO bvo = new BoardVO();
		bvo.setBno("2");
		bvo.setBid("테스트작성자");
		bvo.setBtitle("테스트 제목입니다");
		bvo.setBcontent("테스트 내용입니다");
		
		mapper.register(bvo);
		log.info(bvo);
	}
	
} //end of BoardMapperTest
