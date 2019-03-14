package com.czxy.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Pupupupupu on 2019/3/5.
 */
@Table(name = "cartgoods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="goodsname")
    private String goodsname;

    @Column(name="image")
    private String image;

    @Column(name="price")
    private String price;

    @Column(name="count")
    private Integer count;

    @Column(name="shopprice")
    private String shopprice;

    @Column(name="checked")
    private String checked;
}
