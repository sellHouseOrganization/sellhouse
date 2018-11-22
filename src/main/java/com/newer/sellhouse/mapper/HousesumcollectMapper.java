package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Housesumcollect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HousesumcollectMapper {
    int deleteByPrimaryKey(Integer housesumcollectid);

    int insert(Housesumcollect record);

    Housesumcollect selectByPrimaryKey(Integer housesumcollectid);

    List<Housesumcollect> selectAll();

    int updateByPrimaryKey(Housesumcollect record);

    Housesumcollect findByoffersumidoffertime(@Param("offersumid")Integer offersumid,
                                              @Param("offertime")Integer offertime);
}