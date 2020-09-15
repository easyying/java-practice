package javaPractice.collection.mapPracticeProxy.model;

/**
 * 将页面请求的参数转换为自己的参数类型
 */
public class ProxyModel {
    private String code;
    private Integer version;
    private ApiServerModel apiServerModel;
    private ChannelModel channelModel;
    private ApiVersionModel apiVersionModel;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ApiServerModel getApiServerModel() {
        return apiServerModel;
    }

    public void setApiServerModel(ApiServerModel apiServerModel) {
        this.apiServerModel = apiServerModel;
    }

    public ChannelModel getChannelModel() {
        return channelModel;
    }

    public void setChannelModel(ChannelModel channelModel) {
        this.channelModel = channelModel;
    }

    public ApiVersionModel getApiVersionModel() {
        return apiVersionModel;
    }

    public void setApiVersionModel(ApiVersionModel apiVersionModel) {
        this.apiVersionModel = apiVersionModel;
    }
}
