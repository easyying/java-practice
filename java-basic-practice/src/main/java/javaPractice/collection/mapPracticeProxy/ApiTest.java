package javaPractice.collection.mapPracticeProxy;

import javaPractice.collection.mapPracticeProxy.model.ApiServerMap;
import javaPractice.collection.mapPracticeProxy.model.ApiVersionModel;

import java.util.*;

/**
 *技术：
 * 将字符串转为字符串数组
 * 字符串转为整型
 * map的toString（）方法
 *
 */
public class ApiTest {
    public static void main(String[] args) {
        List<String>  apiList = new ArrayList<String>();
        apiList.add("1_tapi_100_105.24");
        apiList.add("1_eapi_112_100.200");
        apiList.add("1_dapi_104_105.219");
        apiList.add("1_ucmapi_100_102.234");
        apiList.add("1_ucmapi_100_90.213");
        apiList.add("1_tapi_101_105.23");
        apiList.add("1_tapi_100_105.22");
        System.out.println("原始的apiList:"+apiList);
        System.out.println();

        Map<String,ApiServerMap> apiServerListMap = new HashMap<String, ApiServerMap>();
        for (String api:apiList) {
            ApiVersionModel apiVersionModel= buildApiVersionModel(api);
            if(apiVersionModel!=null){
                ApiServerMap apiServerMap =apiServerListMap.get(apiVersionModel.getApiName());
                if(apiServerMap==null){
                    apiServerMap = new ApiServerMap();
                    apiServerListMap.put(apiVersionModel.getApiName(),apiServerMap);
                }
                apiServerMap.putApiModel(apiVersionModel);
                /*System.out.println("转换后的一个apiServerMapl为："+apiServerMap.getVersionToApiModels());*/
                System.out.println();
            }
        }
        System.out.println("apiServerListMap为："+apiServerListMap);//最终想要的结果


    }
    //构造apiVersionModel（将String变为ApiVersionModel类型，拆分将String）
    public static ApiVersionModel buildApiVersionModel(String apiVeSt){
        if(apiVeSt==null||apiVeSt.isEmpty()){
            return null;
        }
        String[] apiArray=apiVeSt.split("_");//将字符串转为字符串数组
       /* System.out.println("拆分成的数组为："+ Arrays.toString(apiArray));*/
        System.out.println();

        ApiVersionModel apiVersionModel = new ApiVersionModel();
        apiVersionModel.setApiName(apiArray[1]);
        apiVersionModel.setVersion(Integer.parseInt(apiArray[2]));//字符串转为整型
        apiVersionModel.setIp(apiArray[3]);
     /*   System.out.println("转换后的一个apiVersionModel为："+apiVersionModel);*/

       /* System.out.println("转换后的一个apiVersionModel的名字为："+apiVersionModel.getApiName());
        System.out.println("转换后的一个apiVersionModel的版本号为："+apiVersionModel.getVersion());
        System.out.println("转换后的一个apiVersionModel的ip为："+apiVersionModel.getIp());*/
        return apiVersionModel;
    }


}
