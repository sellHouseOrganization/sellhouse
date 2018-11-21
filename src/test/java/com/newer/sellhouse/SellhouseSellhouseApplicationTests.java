package com.newer.sellhouse;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.domain.Refund;
import com.newer.sellhouse.mapper.FloorMapper;
import com.newer.sellhouse.domain.Renames;
import com.newer.sellhouse.mapper.HouseMapper;
import com.newer.sellhouse.mapper.ItemMapper;
import com.newer.sellhouse.mapper.RefundMapper;
import com.newer.sellhouse.mapper.RenameMapper;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellhouseSellhouseApplicationTests {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private FloorMapper floorMapper;
    @Autowired
    private HouseMapper houseMapper;
    @Test
    public void contextLoads() {
        List<Item>items = itemMapper.selectAll("荣盛花语城");
        for(Item item:items){
            System.out.println(item);
        }
    }

    @Test
    public void InsertItem(){
        Item item = new Item();
        item.setItemname("长房半岛蓝湾");
        item.setItemcompanyname("长房地产");
        item.setItemlevel("第一级");
        int ret = itemMapper.insert(item);
        System.out.println(ret);
    }


}
