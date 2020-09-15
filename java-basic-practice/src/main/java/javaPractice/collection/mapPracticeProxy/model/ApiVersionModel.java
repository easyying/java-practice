package javaPractice.collection.mapPracticeProxy.model;

/**
 * api版本和IP地址
 */
public class ApiVersionModel {
    private String apiName;
    private Integer version;
    private String ip;

    @Override
    public String toString(){
        return this.apiName+"+"+this.version.toString()+"+"+this.ip;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
