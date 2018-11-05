package com.wx.springboot5.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaiKe {
    private String id;
    private String desc;
    private List<String> tags=new ArrayList<String>();
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
