package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Offersum;
import java.util.List;

public interface OffersumMapper {
    int deleteByPrimaryKey(Integer offersumid);

    int insert(Offersum record);

    Offersum selectByPrimaryKey(Integer offersumid);

    List<Offersum> selectAll();

    int updateByPrimaryKey(Offersum record);
}