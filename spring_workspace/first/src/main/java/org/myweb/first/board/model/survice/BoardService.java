package org.myweb.first.board.model.survice;

import java.util.ArrayList;

import org.myweb.first.board.model.vo.Board;
import org.myweb.first.common.Paging;

public interface BoardService {
	ArrayList<Board> selectTop3();

	int selectListCount();

	ArrayList<Board> selectList(Paging paging);

	int insertOriginBoard(Board board);

	void updateAddReadCount(int boardNum);

	Board selectBoard(int boardNum);

	void updateReplySeq(Board reply);

	int insertReply(Board reply);

	int deleteBoard(Board board);

	int updateReply(Board reply);
	
	int updateOrigin(Board board);
}
