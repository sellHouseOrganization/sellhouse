package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Changehouse;
import java.util.List;

public interface ChangehouseMapper {
    int deleteByPrimaryKey(Integer changehouseid);

    int insert(Changehouse record);

    Changehouse selectByPrimaryKey(Integer changehouseid);

    List<Changehouse> selectAll();

    int updateByPrimaryKey(Changehouse record);
}