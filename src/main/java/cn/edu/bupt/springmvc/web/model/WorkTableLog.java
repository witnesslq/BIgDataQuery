package cn.edu.bupt.springmvc.web.model;

import java.util.Date;

public class WorkTableLog {
    private Integer id;

    private Integer workTableId;

    private String type;

    private Date operateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkTableId() {
        return workTableId;
    }

    public void setWorkTableId(Integer workTableId) {
        this.workTableId = workTableId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}