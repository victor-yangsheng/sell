package com.smarter.sell.service.impl;

import com.smarter.sell.dao.ProductCategoryDao;
import com.smarter.sell.entities.ProductCategory;
import com.smarter.sell.service.ProductCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    void findOneById() {
        ProductCategory productCategory = productCategoryService.findOneById(1);
        System.out.println(productCategory);
    }

    @Test
    void insertProductCategory() {
    }

    @Test
    void updateProductCategory() {
    }

    @Test
    void findAllByCotegoryType() {
    }
}