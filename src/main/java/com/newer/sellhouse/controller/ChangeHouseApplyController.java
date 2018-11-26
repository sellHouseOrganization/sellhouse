package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.ChangeHouseApply;
import com.newer.sellhouse.service.ChangeHouseApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("changeHouseApply")
public class ChangeHouseApplyController {

    @Autowired
    private ChangeHouseApplyService changeHouseApplyService;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResponseEntity<?> addAdmitbuy(@RequestBody ChangeHouseApply changeHouseApply){
        int ret = changeHouseApplyService.addChangeHouseApply(changeHouseApply);
            return new ResponseEntity<>(ret,HttpStatus.OK);
    }
}
