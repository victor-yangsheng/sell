package com.smarter.sell.dao;

import com.smarter.sell.entities.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    void findOneByIdTest(){
        ProductCategory productCategory = productCategoryDao.findOneById(1);
        productCategory.setCategoryName("哇哈哈");
        productCategoryDao.updateProductCategory(productCategory);
    }

    @Test
    void insertProductCategoryTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(2);

        Integer integer = productCategoryDao.insertProductCategory(productCategory);
        System.out.println(integer);
    }

    @Test
    void findProductCategoryListTest(){
        List<ProductCategory> productCategoryList = productCategoryDao.findAllByCotegoryType(Arrays.asList(1, 2, 3));
        System.out.println(productCategoryList);
    }

}