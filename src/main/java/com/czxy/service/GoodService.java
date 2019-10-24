package com.czxy.service;

import com.czxy.dao.GoodMapper;
import com.czxy.pojo.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 遗憾就遗憾吧
 * @Date 2019/10/22
 * @jdk 1.8
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodService {
    @Autowired
    private GoodMapper goodMapper;

    public List<Good> findAll() {
        return goodMapper.selectAll();
    }
}
