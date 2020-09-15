package javaPractice.collection.mapPracticeProxy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public  class ApiServerMap {
        private Integer newVersion;//该项目的最新版本
        private Map<Integer,List<ApiVersionModel>> versionToApiModels = new HashMap<Integer,List<ApiVersionModel>>();//该项目所对应版本的ip地址们


        public void putApiModel(ApiVersionModel apiVersionModel){
            List<ApiVersionModel> apiVeList = versionToApiModels.get(apiVersionModel.getVersion());
            if(apiVeList==null){
                apiVeList = new ArrayList<ApiVersionModel>();
                versionToApiModels.put(apiVersionModel.getVersion(),apiVeList);
            }
            apiVeList.add(apiVersionModel);

            if(this.newVersion==null||this.newVersion<apiVersionModel.getVersion()){
                this.newVersion= apiVersionModel.getVersion();
            }

        }

        @Override
        public String toString(){//这个很重要！！！！！！！！！
            return newVersion+"+"+versionToApiModels.toString();
        }


        public Integer getNewVersion() {
            return newVersion;
        }

        public void setNewVersion(Integer newVersion) {
            this.newVersion = newVersion;
        }

        public Map<Integer, List<ApiVersionModel>> getVersionToApiModels() {
            return versionToApiModels;
        }

        public void setVersionToApiModels(Map<Integer, List<ApiVersionModel>> versionToApiModels) {
            this.versionToApiModels = versionToApiModels;
        }
    }

