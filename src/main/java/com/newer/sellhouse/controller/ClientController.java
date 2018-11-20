package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.service.ClientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
@RestController
@RequestMapping("Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * 模糊查询and查询所有信息
     * @param cardnumber
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(@RequestParam(name="cardnumber",required = false)String cardnumber){
        List<Clientcontactcareful> clientList=clientService.findAll();
        if(clientList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clientList,HttpStatus.OK);
    }
    public ResponseEntity<> delClient(@RequestParam(name=""))

}
