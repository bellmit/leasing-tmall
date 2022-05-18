package com.hshc.relay.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-01 15:36
 */
public class BaseEntity implements Serializable{

    private Integer id;

    @JSONField(name = "create_time", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    @JSONField(name = "modify_time", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp modifyTime;

    private User creator;

    private User modifier;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getModifier() {
        return modifier;
    }

    public void setModifier(User modifier) {
        this.modifier = modifier;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
