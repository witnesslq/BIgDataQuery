package cn.edu.bupt.springmvc.web.model;

import java.util.Date;

public class DataSource {
    private Integer id;

    private String name;

    private Boolean isDeleted;

    private String basedTableType;

    private String tableNames;

    private Integer dataId;

    private Integer createorId;

    private Date createTime;

    private String tags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getBasedTableType() {
        return basedTableType;
    }

    public void setBasedTableType(String basedTableType) {
        this.basedTableType = basedTableType == null ? null : basedTableType.trim();
    }

    public String getTableNames() {
        return tableNames;
    }

    public void setTableNames(String tableNames) {
        this.tableNames = tableNames == null ? null : tableNames.trim();
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getCreateorId() {
        return createorId;
    }

    public void setCreateorId(Integer createorId) {
        this.createorId = createorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }
}