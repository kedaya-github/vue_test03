package com.czxy.service;

import com.czxy.dao.ProductMapper;
import com.czxy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.naming.Name;
import java.util.List;

/**
 * @author 遗憾就遗憾吧
 * @Date 2019/10/24
 * @jdk 1.8
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> findAll(){
        return productMapper.selectAll();
    }

}
