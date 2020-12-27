package com.itheima.service;


import com.itheima.pojo.Items;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)app.getBean("itemsServiceImpl");

        List<Items> list = itemsService.findAll();
        System.out.println(list);

        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
