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
    public ResponseEntity<?>listAll(@RequestParam(name = "itemname",required = false)String itemname){
        List<Item>ItemList = itemService.itemList(itemname);
        if(ItemList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(ItemList,HttpStatus.OK);
    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public ResponseEntity<?>InsertItem(Item item){
        int ret = itemService.InsertItem(item);
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateItem(Item item){
        int ret = itemService.UpdateItem(item);
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "Delete",method = RequestMethod.DELETE)
    public ResponseEntity<?>InsertItem(@RequestParam(name = "ckid",required = true) String ckid){
        String[]ckid1 =ckid.split(",");
        System.out.println(ckid1.length);
        int ret = 0;
        for(int i=0;i<ckid1.length;i++){
            int ItemId = Integer.parseInt(ckid1[i]);
            int retFloor = itemService.ItemAndFloor(ItemId);
            ret = itemService.DeleteItem(ItemId);
            if(i==ckid1.length){
                break;
            }
        }
        if(ret>=0){
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

    @RequestMapping(value = "changeSettle",method = RequestMethod.PUT)
    public ResponseEntity<?>changeSettle(@RequestParam(name = "itemid")String itemid,
                                         @RequestParam(name = "notSettle")Integer notSettle){
        String[]itemid1 = itemid.split(",");
        int ret=0;
        for(int i=0;i<itemid1.length;i++){
            int ItemId = Integer.parseInt(itemid1[i]);
            ret = itemService.changeSettle(ItemId, notSettle);
            if(i==itemid1.length){
                break;
            }
        }
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
