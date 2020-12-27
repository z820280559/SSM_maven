package com.itheima.dao;

import com.itheima.ssm.dao.ItemsDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao)app.getBean("itemsDao");
        System.out.println("商品列表：：："+itemsDao.findAll());
    }
}
