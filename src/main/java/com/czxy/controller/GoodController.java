package com.czxy.controller;

import com.czxy.pojo.Good;
import com.czxy.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 遗憾就遗憾吧
 * @Date 2019/10/22
 * @jdk 1.8
 */
@RestController
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodService goodService;

    /**
      * @Author: kedaya
      * @Description:  获取所有的 Good
      * @Date: 2019/10/22
      * @return: org.springframework.http.ResponseEntity<java.util.List<com.czxy.pojo.Good>>
      **/
    @GetMapping
    public ResponseEntity<List<Good>> findAll(){
        List<Good> goods = goodService.findAll();
        return ResponseEntity.ok(goods);
    }





}
