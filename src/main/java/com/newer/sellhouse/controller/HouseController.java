package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.domain.Roomtype;
import com.newer.sellhouse.mapper.HouseMapper;
import com.newer.sellhouse.mapper.RoomtypeMapper;
import com.newer.sellhouse.service.HouseService;
import com.newer.sellhouse.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "House")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @Autowired
    private RoomTypeService roomTypeService;

    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public ResponseEntity<?>listAll(){
        List<House>houseList = houseService.listAll();
        if(houseList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(houseList,HttpStatus.OK);
    }

    @RequestMapping(value = "Delete",method = RequestMethod.DELETE)
    public ResponseEntity<?>DeleteHouse(@RequestParam(name = "ckid",required = true) String ckid){
        String[]ckid1 =ckid.split(",");
        System.out.println(ckid1.length);
        int ret = 0;
        for(int i=0;i<ckid1.length;i++){
            int houseid = Integer.parseInt(ckid1[i]);
            ret = houseService.Delete(houseid);
            if(i==ckid1.length){
                break;
            }
        }
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "listRoom",method = RequestMethod.GET)
    public ResponseEntity<?>listRoom(){
        List<Roomtype>roomtypeList = roomTypeService.roomtypeList();
        if(roomtypeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(roomtypeList,HttpStatus.OK);
    }

    @RequestMapping(value = "queryId",method = RequestMethod.GET)
    public ResponseEntity<?>QueryFloor(Integer houseid){
        House house = houseService.queryById(houseid);
        if(house!=null){
            return new ResponseEntity<>(house,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public ResponseEntity<?>InsertHouse(House house){
        int ret=0;
        int tienumber = house.getTiernumber();
        int housenumber = house.getHousenumber();
        for(int i = 1;i<=tienumber;i++){
            for(int j = 1;j<=housenumber;i++){
                house.setHousenumber(j);
                house.setTiernumber(i);
                ret = houseService.Insert(house);
            }
        }
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateHouse(House house){
        int ret = houseService.Update(house);
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
