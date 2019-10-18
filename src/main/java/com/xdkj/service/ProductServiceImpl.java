package com.xdkj.service;

import com.xdkj.bean.Product;
import com.xdkj.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mr guo
 * @create 2019-10-16 9:36
 */
@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    private ProductDao pd;

    @Override
    public List<Product> findAll() {
        return pd.findAll();
    }

    @Override
    public boolean deleteByPid(Integer pid) {
        return pd.deleteByPid(pid);
    }

    @Override
    public boolean addProduct(Product product) {
        return pd.addProduct(product);
    }

    @Override
    public boolean updateByPid(Product product) {
        return pd.updateByPid(product);
    }

    @Override
    public Product findByPid(Integer pid) {
        return pd.findByPid(pid);
    }
}
