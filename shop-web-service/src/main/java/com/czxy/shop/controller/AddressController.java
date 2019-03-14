package com.czxy.shop.controller;

import com.czxy.shop.pojo.Address;
import com.czxy.shop.service.AddressService;
import com.czxy.shop.vo.BaseResult;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jnlp.IntegrationService;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/7.
 */
@RestController
@RequestMapping
public class AddressController {

    @Resource
    private AddressService addressService;

    @GetMapping("/getAddress")
    public ResponseEntity<List> findAaddress(){
        List<Address> list = addressService.findAllAddress();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/findAddress/{id}")
    public ResponseEntity<Address> findAddress(@PathVariable("id") Integer id){
        Address address = addressService.findAddress(id);
        return ResponseEntity.ok(address);
    }

    @PutMapping("/saveAddress")
    public ResponseEntity<BaseResult> saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);
        return ResponseEntity.ok(new BaseResult(0,"成功"));
    }

}
