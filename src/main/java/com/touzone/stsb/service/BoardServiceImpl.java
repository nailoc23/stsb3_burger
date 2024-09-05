package com.touzone.stsb.service;

import com.touzone.stsb.dao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardDao boardDao;

    @Override
    public int getBoardCount() throws Exception {
        return boardDao.getBoardCount();
    }
}
