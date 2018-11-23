package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySche;
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
    public ResponseEntity<?> paramAdmitbuySel(@RequestParam(name = "clientName",required = false)String clientName){
        List<AdmitbuySel> admitbuySelList = admitbuySelService.selectAll(clientName);

        return new ResponseEntity<>(admitbuySelList,HttpStatus.OK);
    }

    @RequestMapping(value = "findByAdmitbuyid",method = RequestMethod.GET)
    public ResponseEntity<?> findByAdmitbuyid(@RequestParam(name = "admitbuyid")Integer admitbuyid){
        AdmitbuySel admitbuySel = admitbuySelService.findByAdmitbuyid(admitbuyid);
        return new ResponseEntity<>(admitbuySel,HttpStatus.OK);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public ResponseEntity<?> delAdmitbuy(@RequestParam(name = "aid",required = true) String aid) {
        String[] id = aid.split(",");
        System.out.println(id.length);
        int ret = 0;
        for(int i=0;i<id.length;i++){
            int AdmitbuyId = Integer.parseInt(id[i]);
            ret = admitbuySelService.delAdmitbuySel(AdmitbuyId);
            if(i==id.length){
                break;
            }
        }
        if(ret==1){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

   /* @RequestMapping(value = "finAll",method = RequestMethod.GET)
    public ResponseEntity<?>findAll(@RequestParam("clientName") String clientName){
        AdmitbuySche admitbuySche = admitbuySelService.findForName(clientName);
//        if(admitbuySche!=null){
            return new ResponseEntity<>(admitbuySche,HttpStatus.OK);
//        }
//        return new ResponseEntity<>("",HttpStatus.OK);
    }*/

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
   public ResponseEntity<?> findForName(@RequestParam("clientName") String clientName){
    AdmitbuySche admitbuySche = admitbuySelService.findForName(clientName);
    return new ResponseEntity<>(admitbuySche,HttpStatus.OK);
   }

   @RequestMapping(value = "insert",method = RequestMethod.POST)
   public ResponseEntity<?> addAdmitbuy(Admitbuy admitbuy){
        int ret = admitbuySelService.addAdmitbuy(admitbuy);
        if (ret >0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        return new ResponseEntity<>(ret,HttpStatus.NO_CONTENT);
   }
}

