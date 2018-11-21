package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    @Insert("insert into house (houseid, floorid, tiernumber,housedate, houseTypeid, marketState,houseStateid, houseNumber)values(#{houseid},#{floorid},#{tiernumber},now(),#{housetypeid},0,0,#{housenumber})")
    int insert(House record);


    House selectByPrimaryKey(Integer houseid);

    List<House> selectAll();

    @Update("update house set floorid =#{floorid},tiernumber =#{tiernumber},housedate=now(),houseTypeid =#{housetypeid},marketState=0,houseStateid=0,houseNumber=#{housenumber} where houseid=#{houseid}")
    int updateByPrimaryKey(House record);
}