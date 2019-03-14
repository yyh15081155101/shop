package com.czxy.shop.controller;

import com.czxy.shop.pojo.IndexGoods;
import com.czxy.shop.pojo.IndexLbt;
import com.czxy.shop.service.IndexGoodsService;
import com.czxy.shop.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@RestController
@RequestMapping
public class IndexGoodsController {

    @Resource IndexGoodsService indexGoodsService;

    /**
     * 查询首页的商品
     * @return
     */
    @GetMapping("/indexGoods")
    public ResponseEntity<BaseResult> selectIndexGoods(){
        List<IndexGoods> list = indexGoodsService.findAll();
        return ResponseEntity.ok(new BaseResult(0,"成功").append("data",list));
    }

    /**
     * 查询轮播图
     * @return
     */
    @GetMapping("/indexlbt")
    public ResponseEntity<BaseResult> selectIndexLbt(){
        List<IndexLbt> list = indexGoodsService.findIndexLbt();
        return ResponseEntity.ok(new BaseResult(0,"成功").append("data",list));
    }

}
