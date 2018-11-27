package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    @Insert("insert into house (houseid, floorid, tiernumber,housedate,orientation,housetype,hallRoom,pooledArea,privateArea," +
            " marketState,houseStateid,houseNumber)values(#{houseid},#{floorid},#{tiernumber},now(),#{orientation},#{housetype}," +
            "#{hallRoom},#{pooledArea},#{privateArea},0,0,#{housenumber})")
    int insert(House record);


    House selectByPrimaryKey(Integer houseid);

    List<House> selectAll(@Param("pageno") Integer pageno,@Param("pagesum") Integer pagesum );

    @Update("update house h set h.orientation=#{orientation},h.hallRoom=#{hallRoom},h.houseType=#{housetype},h.pooledArea=#{pooledArea},h.privateArea=#{privateArea} where h.houseNumber=#{housenumber} AND h.floorid=#{floorid}")
    int updateByPrimaryKey(House record);

    int selectRum();

    @Update("update House set housestateid=#{housestateid} where houseid = #{houseid}")
    int changeState(@Param("houseid")Integer houseid,@Param("housestateid")Integer housestateid);
}