package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Housesumcollect;
import com.newer.sellhouse.domain.Offersum;
import com.newer.sellhouse.domain.Promptnotesregister;
import com.newer.sellhouse.service.OffersumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "findbyadmitbuyid",method = RequestMethod.GET)
    public ResponseEntity<?> findbyadmitbuyid(@RequestParam(value = "admitbuyid")Integer admitbuyid){
        List<Offersum> offersumList = offersumService.findbyadmitbuyid(admitbuyid);
        return new ResponseEntity<>(offersumList,HttpStatus.OK);
    }

    @RequestMapping(value = "addhousesumcollect",method = RequestMethod.POST)
    public ResponseEntity<?> addhousesumcollect(@RequestBody Housesumcollect housesumcollect){
        int i = offersumService.addhousesumcollect(housesumcollect);
        return new ResponseEntity<>(i,HttpStatus.OK);
    }

    @RequestMapping(value = "findByoffersumidoffertime",method = RequestMethod.GET)
    public ResponseEntity<?> findByoffersumidoffertime(@RequestParam(value = "offersumid") Integer offersumid,
                                                       @RequestParam(value = "offertime")Integer offertime){
        Housesumcollect housesumcollect = offersumService.findByoffersumidoffertime(offersumid, offertime);
//        if (housesumcollect==null){
//            return new ResponseEntity<>("false",HttpStatus.OK);
//        }else {
            return new ResponseEntity<>(housesumcollect,HttpStatus.OK);
//        }
    }

    /**
     * 添加催款数据
     * @param promptnotesregister
     * @return
     */
    @RequestMapping(value = "addprompt",method = RequestMethod.POST)
    public ResponseEntity<?> addprompt(@RequestBody Promptnotesregister promptnotesregister){
        int i = offersumService.addprompt(promptnotesregister);
        return new ResponseEntity<>(i,HttpStatus.OK);
    }

}
