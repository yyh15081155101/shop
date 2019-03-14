package com.czxy.shop.dao;

import com.czxy.shop.pojo.Address;
import org.apache.ibatis.annotations.Select;
import org.springframework.http.ResponseEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by Pupupupupu on 2019/3/7.
 */
@org.apache.ibatis.annotations.Mapper
public interface AddressMapper extends Mapper<Address>{

}
