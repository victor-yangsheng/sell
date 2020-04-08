package com.smarter.sell.dao;

import com.smarter.sell.entities.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryDao {

    ProductCategory findOneById(Integer categoryId);

    Integer insertProductCategory(ProductCategory productCategory);

    Integer updateProductCategory(ProductCategory productCategory);

    List<ProductCategory> findAllByCotegoryType(List<Integer> categoryTypeList);
}
