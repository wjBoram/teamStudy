package com.cmpy.reactboard.db;

import com.cmpy.reactboard.entity.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BoardMapper {
    /*
        mapper xml파일의 resultType 해당하는 클래스에 결과를 담으며,
        N개가 되므로 MutableList로 Return 타입을 설정합니다.
    */
    public List<BoardEntity> getBoardList(HashMap<String, Object> paramMap);

    public int getBoardTotalCount(HashMap<String, Object> paramMap);

    public BoardEntity getBoardOne(Long idx);

    public int insertBoard(BoardEntity entity);

    public int updateBoard(BoardEntity entity);

    public int deleteBoard(Long idx);
}
