package com.czxy.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Pupupupupu on 2019/3/7.
 */
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="mobile")
    private String mobile;

    @Column(name="ssx")
    private String ssx;

    @Column(name="detaileAddr")
    private String detaileAddr;

    @Column(name="email")
    private String email;

    @Column(name="isdefault")
    private Integer isdefault;
}