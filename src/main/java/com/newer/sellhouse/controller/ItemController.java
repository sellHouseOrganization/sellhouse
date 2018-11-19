package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 查询所有and模糊查询
     * @param ItemName
     * @return
     */
    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public ResponseEntity<?>listAll(@RequestParam(name = "ItemName",required = false)String ItemName){
        List<Item>ItemList = itemService.itemList(ItemName);
        if(ItemList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(ItemList,HttpStatus.OK);
    }

    @RequestMapping(value = "Insert",method = RequestMethod.POST)
    public ResponseEntity<?>InsertItem(Item item){
        int ret = itemService.InsertItem(item);
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "Update",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateItem(Item item){
        int ret = itemService.UpdateItem(item);
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "Delete",method = RequestMethod.DELETE)
    public ResponseEntity<?>InsertItem(Integer ItemId){
        int ret = itemService.DeleteItem(ItemId);
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "queryId",method = RequestMethod.GET)
    public ResponseEntity<?>QueryItem(Integer ItemId){
        Item item = itemService.QueryItem(ItemId);
        if(item!=null){
            return new ResponseEntity<>(item,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
