package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.domain.Pager;
import com.newer.sellhouse.service.HouseService;
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

    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public ResponseEntity<?>listAll(@RequestParam(value = "iDisplayStart",required = true)String iDisplayStart,
                                    @RequestParam(value = "iDisplayLength",required = true)String iDisplayLength){

        House house = new House();
        int pageno =  Integer.parseInt(iDisplayStart);
        int pagesum = Integer.parseInt(iDisplayLength);
        int total = houseService.selectRum();
        List<House>houseList = houseService.listAll(pageno,pagesum);
        if(houseList!=null){
            Pager<House>pager = new Pager<>();
            pager.setData(houseList);
            pager.setiTotalDisplayRecords(total);
            pager.setiTotalRecords(total);
            return new ResponseEntity<>(pager,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
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
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
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
            house.setTiernumber(i);
            ret = houseService.Insert(house);
        }
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateHouse(House house){
        int ret=0;
        if(house!=null){
            int tienumber = house.getTiernumber();
            int housenumber = house.getHousenumber();
            for(int i = 1;i<=tienumber;i++){
                house.setTiernumber(i);
                ret = houseService.Update(house);
            }
        }
        if(ret>=0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "changeState",method = RequestMethod.PUT)
    public ResponseEntity<?>changeNotApertura(@RequestParam(name = "houseid")String houseid,
                                              @RequestParam(name = "housestateid")Integer housestateid){
        String[]houseid1 = houseid.split(",");
        int ret=0;
        for(int i=0;i<houseid1.length;i++){
            int Houseid = Integer.parseInt(houseid1[i]);
            ret = houseService.changeState(Houseid, housestateid);
            if(i==houseid1.length){
                break;
            }
        }
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
