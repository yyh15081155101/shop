package com.czxy.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@Table(name = "indexgoods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IndexGoods {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;
}
