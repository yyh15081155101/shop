package com.czxy.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Pupupupupu on 2019/3/2.
 */
@Table(name = "goods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="goodsname")
    private String goodsname;

    @Column(name="image")
    private String image;

    @Column(name="price")
    private String price;

    @Column(name="shopprice")
    private String shopprice;

    @Column(name="netcontent")
    private String netcontent;

    @Column(name="burdening")
    private String burdening;

    @Column(name="procertificate")
    private String procertificate;

    @Column(name="expirationdate")
    private String expirationdate;

    @Column(name="type")
    private String type;

    @Column(name="index_id")
    private String indexId;

    @Column(name="checked")
    private String checked;

}
