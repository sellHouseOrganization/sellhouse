package com.newer.sellhouse;

import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.mapper.ItemMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellhouseSellhouseApplicationTests {

    @Autowired
    private ItemMapper itemMapper;
    @Test
    public void contextLoads() {
        List<Item>items = itemMapper.selectAll("荣盛花语城");
        for(Item item:items){
            System.out.println(item);
        }
    }

}
