package com.xdkj.dao;

import com.xdkj.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mr guo
 * @create 2019-10-16 9:32
 */
public interface ProductDao {

    List<Product> findAll();

    boolean deleteByPid(Integer pid);

    boolean addProduct(Product product);

    boolean updateByPid(Product product);

    Product findByPid(Integer pid);
}
