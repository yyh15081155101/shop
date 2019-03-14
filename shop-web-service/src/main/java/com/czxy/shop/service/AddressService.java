package com.czxy.shop.service;

import com.czxy.shop.dao.AddressMapper;
import com.czxy.shop.pojo.Address;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/7.
 */
@Service
@Transactional
public class AddressService {

    @Resource
    private AddressMapper addressMapper;


    public List<Address> findAllAddress() {
        List<Address> list = addressMapper.selectAll();
        return list;
    }

    public Address findAddress(Integer id) {
       return addressMapper.selectByPrimaryKey(id);
    }

    public void saveAddress(Address address) {
        addressMapper.updateByPrimaryKey(address);
    }
}
