package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.Item;
import com.newer.sellhouse.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Floor")
public class FloorController {
    @Autowired
    private FloorService floorService;

    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public ResponseEntity<?>listAll(){
        List<Floor>floorList = floorService.selectAll();
        if(floorList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(floorList,HttpStatus.OK);
    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public ResponseEntity<?>InsertFloor(Floor floor){
        int ret = floorService.Insert(floor);
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateFloor(Floor floor){
        int ret = floorService.Update(floor);
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "Delete",method = RequestMethod.DELETE)
    public ResponseEntity<?>DeleteFloor(@RequestParam(name = "ckid",required = true) String ckid){
        String[]ckid1 =ckid.split(",");
        System.out.println(ckid1.length);
        int ret = 0;
        for(int i=0;i<ckid1.length;i++){
            int floorid = Integer.parseInt(ckid1[i]);
            ret = floorService.Delete(floorid);
            if(i==ckid1.length){
                break;
            }
        }
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "queryId",method = RequestMethod.GET)
    public ResponseEntity<?>QueryFloor(Integer floorid){
        Floor floor = floorService.queryById(floorid);
        if(floor!=null){
            return new ResponseEntity<>(floor,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "changeNotOut",method = RequestMethod.PUT)
    public ResponseEntity<?>changeNotOut(@RequestParam(name = "floorid")String floorid,
                                         @RequestParam(name = "notout")Integer notout){
        String[]floorid1 = floorid.split(",");
        int ret=0;
        for(int i=0;i<floorid1.length;i++){
            int FloorId = Integer.parseInt(floorid1[i]);
            ret = floorService.changeNotOut(FloorId, notout);
            if(i==floorid1.length){
                break;
            }
        }
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "changeNotApertura",method = RequestMethod.PUT)
    public ResponseEntity<?>changeNotApertura(@RequestParam(name = "floorid")String floorid,
                                         @RequestParam(name = "notapertura")Integer notapertura){
        String[]floorid1 = floorid.split(",");
        int ret=0;
        for(int i=0;i<floorid1.length;i++){
            int FloorId = Integer.parseInt(floorid1[i]);
            ret = floorService.changeNotApertura(FloorId, notapertura);
            if(i==floorid1.length){
                break;
            }
        }
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
