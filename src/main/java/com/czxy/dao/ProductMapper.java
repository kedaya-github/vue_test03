package com.czxy.dao;

import com.czxy.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 遗憾就遗憾吧
 * @Date 2019/10/24
 * @jdk 1.8
 */
@Mapper
public interface ProductMapper extends tk.mybatis.mapper.common.Mapper<Product> {
}
