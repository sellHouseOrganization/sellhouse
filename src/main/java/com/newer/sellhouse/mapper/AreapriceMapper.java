package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Areaprice;
import java.util.List;

public interface AreapriceMapper {
    int deleteByPrimaryKey(Integer areapriceid);

    int insert(Areaprice record);

    Areaprice selectByPrimaryKey(Integer areapriceid);

    List<Areaprice> selectAll();

    int updateByPrimaryKey(Areaprice record);
}