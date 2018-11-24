package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Clientcontactcareful;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientcontactcarefulMapper {
    int deleteByPrimaryKey(Integer clientcontactcarefulid);

    int insert(Clientcontactcareful record);

    Clientcontactcareful selectByPrimaryKey(Integer clientcontactcarefulid);

    List<Clientcontactcareful> selectAll(@Param("cardnumber") String cardnumber);

    int updateByPrimaryKey(Clientcontactcareful record);
}