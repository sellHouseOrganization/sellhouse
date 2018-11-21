package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Clientcontactcareful;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClientcontactcarefulMapper {
    int deleteByPrimaryKey(Integer clientcontactcarefulid);

    int insert(Clientcontactcareful record);

    Clientcontactcareful selectByPrimaryKey(Integer clientcontactcarefulid);

    List<Clientcontactcareful> selectAll(@Param("cardnumber")String cardnumber);

    int updateByPrimaryKey(Clientcontactcareful record);
}