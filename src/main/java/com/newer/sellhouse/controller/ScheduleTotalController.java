package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.ScheduleTotal;
import com.newer.sellhouse.service.ScheduleTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Total")
public class ScheduleTotalController {

    @Autowired
    private ScheduleTotalService scheduleTotalService ;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<?> listAll() {
        List<ScheduleTotal> scheduleTotalList = scheduleTotalService.listAll();
        if (scheduleTotalList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(scheduleTotalList, HttpStatus.OK);
    }

    /**
     * 删除
     * @param pid
     * @return
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> delSchedule(@RequestParam(name = "pid", required = false) Integer pid) {
        int ret = scheduleTotalService.delSchedule(pid);
        if (ret == 1) {
            return new ResponseEntity<>(ret, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
