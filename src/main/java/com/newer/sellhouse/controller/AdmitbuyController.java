package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.AdmitbuySel;
import com.newer.sellhouse.service.AdmitbuySelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admitbuy")
public class AdmitbuyController {
    @Autowired
    private AdmitbuySelService admitbuySelService;
    /**
     * 姓名查询
     * @param clientName
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseEntity<?> paramDoctors(@RequestParam(name = "clientName",required = false)String clientName){
        List<AdmitbuySel> admitbuySelList = admitbuySelService.selectAll(clientName);

        return new ResponseEntity<>(admitbuySelList,HttpStatus.OK);
    }
}
