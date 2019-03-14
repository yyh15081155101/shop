package com.czxy.shop.controller;

import com.czxy.shop.pojo.Cart;
import com.czxy.shop.service.CartService;
import com.czxy.shop.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/5.
 */
@RestController
@RequestMapping
public class CartController {

    @Resource
    private CartService cartService;

    /**
     * 添加购物车
     * 把商品添加到数据库中
     * @param cart
     * @return
     */
    @PostMapping("/carts")
    public ResponseEntity<BaseResult> addToCart(@RequestBody Cart cart){
        Integer i = cartService.addToCart(cart);
        if(i == 1) {
            //说明添加成功
            return ResponseEntity.ok(new BaseResult(0, "成功"));
        }else{
            return ResponseEntity.ok(new BaseResult(1,"失败"));
        }
    }

    /**
     * 吧商品从数据库中查出来
     * @return
     */
    @GetMapping("/carts")
    public ResponseEntity<BaseResult> getCart(){
        List<Cart> list = cartService.getCart();
        return ResponseEntity.ok(new BaseResult(0,"成功").append("data",list));
    }

    /**
     * 根据界面传过来的id 进行删除操作。
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResult> deleteCart(@PathVariable("id") Integer id){
        cartService.deleteCart(id);
        //提示
        return ResponseEntity.ok( new BaseResult(0,"删除成功"));
    }

    @PutMapping("/updateCarts")
    public ResponseEntity<BaseResult> updateCart(@RequestBody Cart cart){
        //更新
        cartService.updateCart(cart);
        //提示一下
        return ResponseEntity.ok(new BaseResult(0,"更新成功"));
    }

}
