package com.smarter.sell.service;

import com.smarter.sell.entities.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOneById(Integer categoryId);

    Integer insertProductCategory(ProductCategory productCategory);

    Integer updateProductCategory(ProductCategory productCategory);

    List<ProductCategory> findAllByCotegoryType(List<Integer> categoryTypeList);

}
