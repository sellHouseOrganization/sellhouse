package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Adviser;
import java.util.List;

public interface AdviserMapper {
    int deleteByPrimaryKey(Integer adviserid);

    int insert(Adviser record);

    Adviser selectByPrimaryKey(Integer adviserid);

    List<Adviser> selectAll();

    int updateByPrimaryKey(Adviser record);
}