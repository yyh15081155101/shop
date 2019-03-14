package com.czxy.shop.service;

import com.czxy.shop.dao.UserMapper;
import com.czxy.shop.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.insert(user);
    }

    public User findByMobile(String mobile) {
        //拼凑
        Example example = new Example(User.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("mobile",mobile);
        //查询
        return this.userMapper.selectOneByExample(example);
    }

    public void updatePassword(User user) {
        Example example = new Example(User.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("mobile",user.getMobile());
        //删除找到的用户
        this.userMapper.deleteByExample(example);
        //向数据库添加这个传过来的用户
        userMapper.insert(user);
    }
}
