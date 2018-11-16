package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Housesumcollect;
import java.util.List;

public interface HousesumcollectMapper {
    int deleteByPrimaryKey(Integer housesumcollectid);

    int insert(Housesumcollect record);

    Housesumcollect selectByPrimaryKey(Integer housesumcollectid);

    List<Housesumcollect> selectAll();

    int updateByPrimaryKey(Housesumcollect record);
}