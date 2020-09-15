package javaPractice.collection.mapPracticeProxy.model;

import java.util.Date;

public class ApiServerModel {
    private Long id;
    private String name;
    private Date createTime;
    private Date updateTime;
    private String invokeServiceId;//访问哪个api项目的id
    private String infoServiceId;
    private Integer accessType;//访问api项目的方式

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

    public String getInvokeServiceId() {
        return invokeServiceId;
    }

    public void setInvokeServiceId(String invokeServiceId) {
        this.invokeServiceId = invokeServiceId;
    }

    public String getInfoServiceId() {
        return infoServiceId;
    }

    public void setInfoServiceId(String infoServiceId) {
        this.infoServiceId = infoServiceId;
    }

    public Integer getAccessType() {
        return accessType;
    }

    public void setAccessType(Integer accessType) {
        this.accessType = accessType;
    }
}
