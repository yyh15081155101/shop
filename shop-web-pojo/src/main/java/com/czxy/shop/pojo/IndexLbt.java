package com.czxy.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Pupupupupu on 2019/3/1.
 */
@Table(name = "indexlbt")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IndexLbt {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="image")
    private String image;
}
