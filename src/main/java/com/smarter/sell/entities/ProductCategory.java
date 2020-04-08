package com.smarter.sell.entities;

import lombok.Data;

import java.io.Serializable;


@Data
public class ProductCategory implements Serializable {

    /*类目id*/
    private Integer categoryId;

    /*类目名字*/
    private String categoryName;

    /*类目类型*/
    private Integer categoryType;

}
