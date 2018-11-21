package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Floor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FloorMapper {

    int deleteByPrimaryKey(Integer floorid);

    @Insert("insert into floor(floorid,itemid,floornumber,structure,tier,batch,notout,notapertura,createtime)values(#{floorid},#{itemid},#{floornumber},#{structure},#{tier},#{batch},0,0,now())")
    int insert(Floor record);

    Floor selectByPrimaryKey(Integer floorid);

    List<Floor> selectAll();

    @Update("update floor set itemid =#{itemid},floornumber =#{floornumber},structure=#{structure},tier =#{tier},batch =#{batch},notout=0,notapertura=0,createtime = now() where floorid = #{floorid}")
    int updateByPrimaryKey(Floor record);

    @Update("update floor set notout=#{notout} where floorid = #{floorid}")
    int changeNotOut(@Param("floorid")Integer floorid,@Param("notout")Integer notout);

    @Update("update floor set notapertura=#{notapertura} where floorid = #{floorid}")
    int changeNotApertura(@Param("floorid")Integer floorid,@Param("notapertura")Integer notapertura);
}