package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdmitbuyMapper {
    int deleteByPrimaryKey(Integer admitbuyid);

    int insert(Admitbuy record);

    Admitbuy selectByPrimaryKey(Integer admitbuyid);

    List<Admitbuy> selectAll();

    int updateByPrimaryKey(Admitbuy record);
}