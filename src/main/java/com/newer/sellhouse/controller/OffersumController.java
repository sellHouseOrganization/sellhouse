package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.service.OffersumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("offersum")
public class OffersumController {
    @Autowired
    private OffersumService offersumService;

    @RequestMapping(value = "findByClientNameHouseName",method = RequestMethod.GET)
    public ResponseEntity<?> selectAdmitBuyByClientNameHouseName(@RequestParam(value = "clientName",required = false)
            String clientName, @RequestParam(value = "houseName",required = false)String houseName){
        List<Admitbuy> admitbuyList = offersumService.selectAdmitBuyByClientNameHouseName(clientName, houseName);
        return new ResponseEntity<>(admitbuyList,HttpStatus.OK);
    }
}
