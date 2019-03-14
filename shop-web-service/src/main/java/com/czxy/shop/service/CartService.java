package com.czxy.shop.service;

import com.czxy.shop.dao.CartMapper;
import com.czxy.shop.pojo.Cart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/5.
 */
@Service
@Transactional
public class CartService {

    @Resource
    private CartMapper cartMapper;

    public Integer addToCart(Cart cart) {
        Cart c1 = cartMapper.selectByPrimaryKey(cart.getId());
        if(c1 != null){
            Integer count = cart.getCount();
            Integer count1 = c1.getCount();

            count1+=count;
            c1.setCount(count1);
            return cartMapper.updateByPrimaryKey(c1);
        }else{
           return cartMapper.insert(cart);
        }
    }

    public List<Cart> getCart() {
        return cartMapper.selectAll();
    }

    public void deleteCart(Integer id) {
        cartMapper.deleteByPrimaryKey(id);
    }

    public void updateCart(Cart cart) {
        Cart cart1 = cartMapper.selectByPrimaryKey(cart.getId());
        if(cart1!=null){
            cart1.setCount(cart.getCount());
            cart1.setChecked(cart.getChecked());
            System.out.println(cart1);
            cartMapper.updateByPrimaryKey(cart1);
        }

    }
}
