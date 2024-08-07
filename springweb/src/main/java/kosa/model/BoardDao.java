package kosa.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosa.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlTemplate;

	public void insertBoard(Board board) {
		sqlTemplate.getMapper(BoardMapper.class).insertBoard(board);
	}

	public List<Board> listBoard() {
		return sqlTemplate.getMapper(BoardMapper.class).listBoard();
	}

	public Board detailBoard(int seq) {
		return sqlTemplate.getMapper(BoardMapper.class).detailBoard(seq);
	}

}
