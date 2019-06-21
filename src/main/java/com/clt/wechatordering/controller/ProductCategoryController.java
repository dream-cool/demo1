package com.clt.wechatordering.controller;

import com.clt.wechatordering.pojo.ProductCategory;
import com.clt.wechatordering.sevice.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 14:39 2019/6/13
 */
@RestController
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;


    @RequestMapping("/select/{id}")
    @ResponseBody
    public ProductCategory findById(@PathVariable Integer id){
        ProductCategory productCategory = productCategoryService.findById(id);
        return productCategory;
    }

}
