package com.zhujie.study.mybatis._01_GettingStarted;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by zhujie on 15/9/25.
 */
@Alias("blog")
public class Blog {
    private Long id;
    private String name;
    private String remark;
    private Date createtime;
    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
