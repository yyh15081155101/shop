package com.czxy.shop.service;

import com.czxy.shop.dao.IndexGoodsMapper;
import com.czxy.shop.dao.IndexLbtMapper;
import com.czxy.shop.pojo.IndexGoods;
import com.czxy.shop.pojo.IndexLbt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@Service
@Transactional
public class IndexGoodsService {

    @Resource
    private IndexGoodsMapper indexGoodsMapper;

    @Resource
    private IndexLbtMapper indexLbtMapper;

    public List<IndexGoods> findAll() {
        List<IndexGoods> list = indexGoodsMapper.selectAll();
        return list;
    }

    public List<IndexLbt> findIndexLbt() {
        return indexLbtMapper.selectAll();
    }
}
