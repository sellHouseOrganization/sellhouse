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

    public List<Item> itemList(String itemName){
        return itemMapper.selectAll(itemName);
    }
}
