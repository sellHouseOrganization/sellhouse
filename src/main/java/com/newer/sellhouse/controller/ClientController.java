package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.service.ClientContactCarefulService;
import com.newer.sellhouse.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
@RestController
@RequestMapping("Client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientContactCarefulService clientContactCarefulService;

    /**
     * 模糊查询and查询两表信息
     * @param cardnumber
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(@RequestParam(name="cardnumber",required = false)String cardnumber){
        List<Clientcontactcareful> clientList=clientService.findAll(cardnumber);
        if(clientList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clientList,HttpStatus.OK);
    }

    /**
     * 删除客户信息
     * @param clientid
     * @return
     */
    @RequestMapping(value = "delClient",method = RequestMethod.DELETE)
    public ResponseEntity<?> delClient(@PathVariable(name="clientid")Integer clientid){
        int ret=clientService.delClient(clientid);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 添加客户信息
     * @param client
     * @return
     */
    @RequestMapping(value = "addClient",method =RequestMethod.POST)
    public ResponseEntity<?> addClient(@RequestBody Client client){
        int ret=clientService.addClient(client);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 修改客户信息
     * @param client
     * @return
     */
    @RequestMapping(value = "addClient",method =RequestMethod.POST)
    public ResponseEntity<?> updClient(@RequestBody Client client){
        int ret=clientService.updClient(client);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 添加客户明细信息
     * @param clientcontactcareful
     * @return
     */
    @RequestMapping(value = "AddClients",method = RequestMethod.POST)
    public ResponseEntity<?> AddClients(@RequestBody Clientcontactcareful clientcontactcareful){
        int ret=clientContactCarefulService.addClientSh(clientcontactcareful);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 修改客户明细信息
     * @param clientcontactcareful
     * @return
     */
    @RequestMapping(value = "updClients",method = RequestMethod.PUT)
    public ResponseEntity<?> updClients(@RequestBody Clientcontactcareful clientcontactcareful){
        int ret=clientContactCarefulService.updClientSh(clientcontactcareful);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
