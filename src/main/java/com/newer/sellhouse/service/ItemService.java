package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;

    public List<Item> itemList(String itemname){
        return itemMapper.selectAll(itemname);
    }

    public int InsertItem(Item item){
        return itemMapper.insert(item);
    }

    public int UpdateItem(Item item){
        return itemMapper.updateByPrimaryKey(item);
    }

    public int DeleteItem(Integer ItemId){
        return itemMapper.deleteByPrimaryKey(ItemId);
    }

    public Item QueryItem(Integer ItemId){
        return itemMapper.selectByPrimaryKey(ItemId);
    }

    public int changeSettle(Integer itemid,Integer notSettle){
        return itemMapper.SettleChange(itemid,notSettle);
    }

    public int ItemAndFloor(Integer ItemId){
        return itemMapper.ItemAndFloorDel(ItemId);
    }
}
