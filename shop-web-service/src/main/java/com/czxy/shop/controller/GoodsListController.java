package com.czxy.shop.controller;

import com.czxy.shop.pojo.Goods;
import com.czxy.shop.service.GoodsListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/2.
 */
@RestController
@RequestMapping
public class GoodsListController {

    @Resource
    private GoodsListService goodsListService;

    /**
     *  根据index_id 查询对应的商品
     * @param indexId
     * @return
     */
    @GetMapping("/goods/{indexId}")
    public ResponseEntity<List> findGoodsByIndexid(@PathVariable("indexId") String indexId){
        List<Goods> list = goodsListService.findSkuById(indexId);
        System.out.println(list);
        return ResponseEntity.ok(list);
    }

    /**
     *    根据id去查询对应的商品详情。
     * @param id
     * @return
     */
    @GetMapping("/goodsinfo/{id}")
    public ResponseEntity<Goods> findGoodsByIid(@PathVariable("id") String id){
        Goods goods = goodsListService.findGoodsByIid(id);
        System.out.println(goods);
        return ResponseEntity.ok(goods);
    }

    /**
     *
     * @param goodsname
     * @return
     */
    @GetMapping("/selectByGoodsName")
    public ResponseEntity<List> selectByGoodsName(@RequestParam("goodsname") String goodsname){
        List<Goods> list = goodsListService.selectByGoodsName(goodsname);
        System.out.println(list);
        return ResponseEntity.ok(list);
    }

}
