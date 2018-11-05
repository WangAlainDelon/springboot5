package com.wx.springboot5.dao;

import com.wx.springboot5.pojo.BaiKe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaikeDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    public void addBaike(BaiKe baike)
    {
        BaiKe baiKe = mongoTemplate.insert(baike);
    }

    public BaiKe getBike(String id) {
        Criteria criteria=Criteria.where("id").is(id);
        List<BaiKe> baiKe = mongoTemplate.find(Query.query(criteria), BaiKe.class, "baiKe");
        if(baiKe!=null&&baiKe.size()>0)
        {
            return baiKe.get(0);
        }
        return null;
    }

}
