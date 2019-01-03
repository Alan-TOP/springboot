package com.alan.springboot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME",columnDefinition="timestamp default CURRENT_TIMESTAMP")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME",columnDefinition="timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updateTime;
    public BaseEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
