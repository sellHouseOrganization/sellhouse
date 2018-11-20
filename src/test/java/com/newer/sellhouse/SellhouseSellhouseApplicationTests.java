package com.newer.sellhouse;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.mapper.FloorMapper;
import com.newer.sellhouse.domain.Renames;
import com.newer.sellhouse.mapper.ItemMapper;
import com.newer.sellhouse.mapper.RenameMapper;
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


    @Test
    public void UpdateItem(){
        Item item = new Item();
        item.setItemname("万科金域华府");
        item.setItemcompanyname("万科地产");
        item.setItemlevel("一级");
        item.setNotsettle(0);
        item.setItemid(1);
        int ret = itemMapper.updateByPrimaryKey(item);
        System.out.println(ret);
    }

    @Test
    public void SettleChange(){
        int ret = itemMapper.SettleChange(59,1);
        System.out.println(ret);
    }

    @Test
    public void queryById(){
        Item item = itemMapper.selectByPrimaryKey(59);
        System.out.println(item);
    }

    @Test
    public void FloorList(){
        List<Floor>list = floorMapper.selectAll();
        for(Floor floor:list){
            System.out.println(floor);
        }
    }

}
