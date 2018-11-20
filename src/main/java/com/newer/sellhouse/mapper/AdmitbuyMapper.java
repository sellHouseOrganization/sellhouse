package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import org.springframework.stereotype.Repository;

import org.apache.ibatis.annotations.Param;

import com.newer.sellhouse.domain.Renames;

import java.util.List;
@Repository
public interface AdmitbuyMapper {
    int deleteByPrimaryKey(Integer admitbuyid);

    int insert(Admitbuy record);

    Admitbuy selectByPrimaryKey(Integer admitbuyid);

    List<Admitbuy> selectAdmitBuyByClientNameHouseName(@Param("clientName")String clientName,
                                                       @Param("houseName")String houseName);

    int updateByPrimaryKey(Admitbuy record);

    /***
     * 更名操作
     * @param admitbuy
     * @return
     */
    int updRename(Admitbuy admitbuy);

}