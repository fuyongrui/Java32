package com.xdkj.service;

import com.xdkj.bean.Product;

import java.util.List;

/**
 * @author mr guo
 * @create 2019-10-16 9:35
 */
public interface ProductService {

    List<Product> findAll();

    boolean deleteByPid(Integer pid);

    boolean addProduct(Product product);

    boolean updateByPid(Product product);

    Product findByPid(Integer pid);
}
