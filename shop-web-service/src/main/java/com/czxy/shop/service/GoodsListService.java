package com.czxy.shop.service;

import com.czxy.shop.dao.GoodsListMapper;
import com.czxy.shop.pojo.Goods;
import com.czxy.shop.vo.OneSkuResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/3/2.
 */
@Service
@Transactional
public class GoodsListService {

    @Resource
    private GoodsListMapper goodsListMapper;


    public List<Goods> findSkuById(String indexId) {
        Example example = new Example(Goods.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("indexId",indexId);
        List<Goods> list = goodsListMapper.selectByExample(example);
        return list;
    }

    public Goods findGoodsByIid(String id) {
        Goods goods = goodsListMapper.selectByPrimaryKey(id);
        return goods;
    }

    /**
     *   根据goodsname进行模糊查询
     * @param goodsname
     * @return
     */
    public List<Goods> selectByGoodsName(String goodsname) {
        Example example = new Example(Goods.class);
        Example.Criteria c = example.createCriteria();
        c.andLike("goodsname",goodsname);
        List<Goods> list = goodsListMapper.selectByExample(example);
        return list;
    }
}
