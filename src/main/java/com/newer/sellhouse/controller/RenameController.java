package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Renames;
import com.newer.sellhouse.service.RenameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("renames")
public class RenameController {
    @Autowired
    private RenameService renameService;


    /***
     *
     * @param oldclientid
     * @param newclientid
     * @param admitbuyid
     * @param oldname
     * @param oldcardnumber
     * @param newname
     * @param newcardnumber
     * @return
     */
    @RequestMapping(value = "updRe",method = RequestMethod.GET)
    public ResponseEntity<?> updRename(@RequestParam(name = "oldclientid")Integer oldclientid,
                                       @RequestParam(name = "newclientid")Integer newclientid,
                                       @RequestParam(name = "admitbuyid")Integer admitbuyid,
                                       @RequestParam(name = "oldname")String oldname,
                                       @RequestParam(name = "oldcardnumber")String oldcardnumber,
                                       @RequestParam(name = "newname")String newname,
                                       @RequestParam(name = "newcardnumber")String newcardnumber
    ){
        Client oldclient= renameService.selbyid(oldclientid);
        Client newclient= renameService.selbyid(newclientid);
        int ret=0;
        Admitbuy admitbuy=new Admitbuy();
        if(oldclient!=null&&newclient!=null){
            if(oldclient.getClientname().equals(oldname)&&oldclient.getCardnumber().equals(oldcardnumber)&&newclient.getClientname().equals(newname)&&newclient.getCardnumber().equals(newcardnumber)) {
                admitbuy.setAdmitbuyid(admitbuyid);
                admitbuy.setClientid(newclientid);
                ret=renameService.updRename(admitbuy,oldclientid);
                if(ret!=0){
                    return new ResponseEntity<>(ret,HttpStatus.OK);
                }
            }

        }
        return new ResponseEntity<>("修改失败",HttpStatus.OK);
    }

    @RequestMapping(value = "selall",method = RequestMethod.GET)
    public ResponseEntity<?> selAll(){
     List<Renames> list= renameService.selAll();
        if(list.size()>0){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("无数据", HttpStatus.OK);
        }
    }
}
