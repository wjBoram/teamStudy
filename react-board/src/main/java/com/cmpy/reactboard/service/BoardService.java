package com.cmpy.reactboard.service;

import com.cmpy.reactboard.dto.BoardSaveDto;
import com.cmpy.reactboard.entity.BoardEntity;
import com.cmpy.reactboard.utils.Header;
import com.cmpy.reactboard.utils.Search;

import java.util.List;

public interface BoardService {

    public Header<List<BoardEntity>> getBoardList(int page, int size, Search search);

    public Header<BoardEntity> getBoardOne(Long idx);

    public Header<BoardEntity> insertBoard(BoardSaveDto boardSaveDto);

    public Header<BoardEntity> updateBoard(BoardSaveDto boardSaveDto);

    public Header<String> deleteBoard(Long idx);
}
