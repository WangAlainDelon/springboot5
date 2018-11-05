package com.wx.springboot5.service;

import com.wx.springboot5.dao.BaikeDao;
import com.wx.springboot5.pojo.BaiKe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaikeService {
    @Autowired
    private BaikeDao baikeDao;
    public void addBaike(BaiKe baike)
    {
        baikeDao.addBaike(baike);
    }

    public BaiKe getBaike(String id) {
        return baikeDao.getBike(id);
    }
}
