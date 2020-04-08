package com.smarter.sell.entities;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ Author     ：yds.
 * @ Date       ：Created in 16:54 2020/4/7
 * @ Description：商品
 * @ Modified By：
 * @Version: 1.0$
 */
@Data
public class ProductInfo {

    /*商品ID*/
    private String productId;

    /*商品名称*/
    private String productName;

    /*商品价格*/
    private BigDecimal productPrice;

    /*商品库存*/
    private Integer productStock;

    /*商品描述*/
    private String productDescription;

    /*商品小图*/
    private String productIcon;

    /*商品状态*/
    private Integer product_status;

    /*商品类型*/
    private Integer categoryType;

}
