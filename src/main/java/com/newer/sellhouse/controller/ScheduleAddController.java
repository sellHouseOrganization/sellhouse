package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.ScheduleAdd;
import com.newer.sellhouse.service.ScheduleAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("add")
public class ScheduleAddController {

    @Autowired
    private ScheduleAddService scheduleAddService ;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<?> listAll(@RequestParam(name = "clientName", required = false) String clientName) {
        List<ScheduleAdd> scheduleAddList = scheduleAddService.listAll(clientName);
        if (scheduleAddList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(scheduleAddList, HttpStatus.OK);
    }

    /**
     * 根据ID查询
     * @param scheduleid
     * @return
     */
    @RequestMapping(value = "query", method = RequestMethod.GET)
    public ResponseEntity<?> queryById(@RequestParam(name = "scheduleid") Integer scheduleid) {
        ScheduleAdd scheduleAdd = scheduleAddService.queryById(scheduleid);
        if (scheduleAdd != null) {
            return new ResponseEntity<>(scheduleAdd, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
