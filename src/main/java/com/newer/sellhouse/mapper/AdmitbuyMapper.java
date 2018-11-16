package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import java.util.List;

public interface AdmitbuyMapper {
    int deleteByPrimaryKey(Integer admitbuyid);

    int insert(Admitbuy record);

    Admitbuy selectByPrimaryKey(Integer admitbuyid);

    List<Admitbuy> selectAll();

    int updateByPrimaryKey(Admitbuy record);
}