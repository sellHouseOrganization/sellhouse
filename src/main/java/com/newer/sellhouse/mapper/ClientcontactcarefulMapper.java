package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Clientcontactcareful;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientcontactcarefulMapper {
    int deleteByPrimaryKey(Integer clientcontactcarefulid);

    @Insert("insert into Clientcontactcareful(purposeDegree,interviewDate,messageAddress,email,houseMortgageLoan," +
            "aim,projectPrice,needArea,payWay,considerFactor,contactWay,clientid) values(#{purposeDegree},#{interviewDate}" +
            ",#{messageAddress},#{email},#{houseMortgageLoan},#{aim},#{projectPrice},#{needArea}" +
            ",#{payWay},#{considerFactor},#{contactWay},#{clientid})")
    int insert(Clientcontactcareful clientcontactcareful);

    Clientcontactcareful selectByPrimaryKey(Integer clientcontactcarefulid);

    List<Clientcontactcareful> selectAll(@Param("cardnumber") String cardnumber);

    int updateByPrimaryKey(Clientcontactcareful record);
}