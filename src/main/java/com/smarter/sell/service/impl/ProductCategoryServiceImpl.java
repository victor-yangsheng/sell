package com.smarter.sell.service.impl;

import com.smarter.sell.dao.ProductCategoryDao;
import com.smarter.sell.entities.ProductCategory;
import com.smarter.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategory findOneById(Integer categoryId) {
        return productCategoryDao.findOneById(categoryId);
    }

    @Override
    public Integer insertProductCategory(ProductCategory productCategory) {
        return productCategoryDao.insertProductCategory(productCategory);
    }

    @Override
    public Integer updateProductCategory(ProductCategory productCategory) {
        return productCategoryDao.updateProductCategory(productCategory);
    }

    @Override
    public List<ProductCategory> findAllByCotegoryType(List<Integer> categoryTypeList) {
        return productCategoryDao.findAllByCotegoryType(categoryTypeList);
    }
}
