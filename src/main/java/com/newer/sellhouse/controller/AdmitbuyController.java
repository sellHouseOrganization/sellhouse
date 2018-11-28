package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySche;
import com.newer.sellhouse.domain.AdmitbuySel;
import com.newer.sellhouse.service.AdmitbuySelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("admitbuy")
public class AdmitbuyController {
    @Autowired
    private AdmitbuySelService admitbuySelService;

    /**
     * 姓名查询
     *
     * @param clientName
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<?> paramAdmitbuySel(@RequestParam(name = "clientName", required = false) String clientName) {
        List<AdmitbuySel> admitbuySelList = admitbuySelService.selectAll(clientName);

        return new ResponseEntity<>(admitbuySelList, HttpStatus.OK);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> delAdmitbuy(@RequestParam(name = "aid", required = true) String aid) {
        String[] id = aid.split(",");
        System.out.println(id.length);
        int ret = 0;
        for (int i = 0; i < id.length; i++) {
            int AdmitbuyId = Integer.parseInt(id[i]);
            ret = admitbuySelService.delAdmitbuySel(AdmitbuyId);
            if (i == id.length) {
                break;
            }
        }
        if (ret == 1) {
            return new ResponseEntity<>(ret, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findForName(@RequestParam("scheduleid") Integer scheduleid) {
        AdmitbuySche admitbuySche = admitbuySelService.findForName(scheduleid);
        return new ResponseEntity<>(admitbuySche, HttpStatus.OK);
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addAdmitbuy(@RequestParam(name = "firstPay") Double firstPay,
                                         @RequestParam(name = "admitbuyDate")@DateTimeFormat(pattern = "yyyy-MM-dd")Date admitbuyDate,
                                         @RequestParam(name = "managePerson") String managePerson,
                                         @RequestParam(name = "payWayName") String payWayName,
                                         @RequestParam(name = "paywayid") Integer paywayid
                                        /* @RequestParam(name = "remake") String remake,
                                         @RequestParam(name = "scheduleid") Integer scheduleid*/
                                         ) {
       Admitbuy admitbuy = new Admitbuy();
       admitbuy.setFirstPay(firstPay);
       admitbuy.setAdmitbuyDate(admitbuyDate);
       admitbuy.setManagePerson(managePerson);

       int ret = admitbuySelService.addAdmitbuy(admitbuy);
       int upd = admitbuySelService.updAdmitbuy(payWayName,paywayid);
      // int upds = admitbuySelService.updSchedule(remake, scheduleid);
       if (ret > 0 ){
           return new ResponseEntity<>(ret,HttpStatus.OK);
       }else if (upd!=0){
           return new ResponseEntity<>(upd,HttpStatus.OK);
       }/*else if (upds!=0){
           return new ResponseEntity<>(upds,HttpStatus.OK);
       }*/
        return new ResponseEntity<>("失败",HttpStatus.OK);
    }
}

