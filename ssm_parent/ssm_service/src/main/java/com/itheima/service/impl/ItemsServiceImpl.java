package com.itheima.service.impl;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.ssm.dao.ItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void save(Items items) {
        itemsDao.save(items);

        //int i = 1 / 0;
    }
}
