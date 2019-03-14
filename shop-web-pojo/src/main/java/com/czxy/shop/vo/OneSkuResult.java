package com.czxy.shop.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;

/**
 * Created by Pupupupupu on 2018/12/25.
 */
@Data
public class OneSkuResult {

    private Integer id;

    private String goodsname;

    private String image;

    private String price;

    private String shopprice;

    private String netcontent;

    private String burdening;

    private String procertificate;

    private String expirationdate;

    private String type;

    @JsonProperty("index_id")
    private String indexId;
}
