package com.itheima.ssm.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {

    List<Items> findAll();

    void save(Items items);
}
