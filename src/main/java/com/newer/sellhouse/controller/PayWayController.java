package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.Payway;
import com.newer.sellhouse.service.PayWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "PayWay")
public class PayWayController {
    @Autowired
    private PayWayService payWayService;

    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public ResponseEntity<?> listAll(){
        List<Payway> payways = payWayService.listAll();
        if(payways.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(payways,HttpStatus.OK);
    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public ResponseEntity<?>InsertFloor(Payway payway){
        payway.setNotstart("0");
        int ret = payWayService.Insert(payway);
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateFloor(Payway payway){
        payway.setNotstart("0");
        int ret = payWayService.Update(payway);
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
            int paywayid = Integer.parseInt(ckid1[i]);
            ret = payWayService.Delete(paywayid);
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
    public ResponseEntity<?>QueryFloor(Integer paywayid){
        Payway payway = payWayService.queryById(paywayid);
        if(payway!=null){
            return new ResponseEntity<>(payway,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "changeState",method = RequestMethod.PUT)
    public ResponseEntity<?>changeNotOut(@RequestParam(name = "paywayid")Integer paywayid,
                                         @RequestParam(name = "notstart")Integer notstart){
        int ret=0;
        ret = payWayService.changeStart(paywayid, notstart);
        if(ret>=1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
