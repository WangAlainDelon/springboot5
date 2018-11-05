package com.wx.springboot5.controller;

import com.wx.springboot5.pojo.BaiKe;
import com.wx.springboot5.service.BaikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MongoControler {
    @Autowired
    private BaikeService baikeService;

    @RequestMapping(value = "/addbaike/{id}/{desc}")
    public BaiKe addBaike(@PathVariable String id,@PathVariable String desc)

    {
        BaiKe baiKe=new BaiKe();
        baiKe.setCreateDate(new Date());
        baiKe.setId(id);
        baiKe.setDesc(desc);
        List<String> tags=new ArrayList<String>();
        tags.add("b");
        tags.add("c");
        baiKe.setTags(tags);
        baikeService.addBaike(baiKe);
        return baiKe;
    }
    //单条件查询
    @RequestMapping(value = "/getBaike/{id}")
    public BaiKe getBaike(@PathVariable String id)
    {
        BaiKe baike = baikeService.getBaike(id);
        System.out.print(baike.getId()+"--"+baike.getDesc()+"--"+baike.getCreateDate()+"--"+baike.getTags().get(0));
        return baike;
    }
}
