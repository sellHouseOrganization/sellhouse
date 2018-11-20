package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    int deleteByPrimaryKey(Integer itemid);

    @Insert("insert into item(itemName,itemCompanyName,itemLevel,notSettle) values (#{itemname},#{itemcompanyname},#{itemlevel},0 )")
    int insert(Item item);

    Item selectByPrimaryKey(Integer itemid);

    //查询全部
    List<Item> selectAll(@Param("itemname") String itemname);

    @Update("update item set itemName=#{itemname},itemCompanyName=#{itemcompanyname},itemLevel=#{itemlevel},notSettle=0 where itemid = #{itemid}")
    int updateByPrimaryKey(Item item);

    int SettleChange(@Param("itemid") Integer itemid, @Param("notSettle") Integer notSettle);
}