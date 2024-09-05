package com.touzone.stsb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

    @Autowired
    private SqlSession sqlSession;

    public int getBoardCount() throws Exception {
        // TODO Auto-generated method stub
        return sqlSession.selectOne("BoardDao.getBoardCount");
    }

}
