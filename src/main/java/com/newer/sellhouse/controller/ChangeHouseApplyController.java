package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.ChangeHouseApply;
import com.newer.sellhouse.domain.ChangeHouseEdit;
import com.newer.sellhouse.domain.Payway;
import com.newer.sellhouse.service.ChangeHouseApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("changeHouseApply")
public class ChangeHouseApplyController {

    @Autowired
    private ChangeHouseApplyService changeHouseApplyService;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResponseEntity<?> addChangeHouseApply(@RequestBody ChangeHouseApply changeHouseApply){
        int ret = changeHouseApplyService.addChangeHouseApply(changeHouseApply);
        return new ResponseEntity<>(ret,HttpStatus.OK);
    }

    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public ResponseEntity<?> changeHouseApplyList(){
        List<ChangeHouseApply> changeHouseApplyList = changeHouseApplyService.findAll();
        return new ResponseEntity<>(changeHouseApplyList,HttpStatus.OK);
    }

    @RequestMapping(value = "findChangeHouse",method = RequestMethod.GET)
    public ResponseEntity<?> findChangeHouse(){
        List<ChangeHouseApply> changeHouseApplyList = changeHouseApplyService.findChangeHouse();
        return new ResponseEntity<>(changeHouseApplyList,HttpStatus.OK);
    }

    @RequestMapping(value = "findEditByadmitbuyid",method = RequestMethod.GET)
    public ResponseEntity<?> findEditByadmitbuyid(@RequestParam("admitbuyid")Integer admitbuyid){
        ChangeHouseEdit changeHouseEdit = changeHouseApplyService.findEditByadmitbuyid(admitbuyid);
        return new ResponseEntity<>(changeHouseEdit,HttpStatus.OK);
    }

    @RequestMapping(value = "findAllPayway",method = RequestMethod.GET)
    public ResponseEntity<?> findAllPayway(){
        List<Payway> paywayList = changeHouseApplyService.findAllPayway();
        return new ResponseEntity<>(paywayList,HttpStatus.OK);
    }

}
