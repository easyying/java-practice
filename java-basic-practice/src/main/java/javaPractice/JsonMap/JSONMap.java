package javaPractice.JsonMap;

import javaPractice.JsonMap.test.Rule;
import javaPractice.JsonMap.test.EcuRule;

import java.util.ArrayList;
import java.util.List;

/**
 * map输出格式：{键1=值1，键2=值2}  用==连接起来，且没有双引号！！！
 * json对象转json字符串的时候：输入啥（包括引号）就输出啥
 *
 * JSON.parseObject，是将Json字符串转化为相应的对象；JSON.toJSONString则是将对象转化为Json字符串
 *java后台中得用json对象去处理 得把获取到的json字符串转为json对象
 * 通过HTTP获取JSON数据.
 */

public class JSONMap {

    public static void main(String[] args) {
        List<EcuRule> ecuRules = new ArrayList<EcuRule>();


        EcuRule y1 = new EcuRule();

        y1.setEcuName("TBOX");

        List<Rule> rules1 = new ArrayList<>();
        Rule  r1 = new Rule();
        r1.setMaxVersion("1代");
        r1.setVersionType("MCU");
        r1.setRule("小于");
        r1.setVersion("72");
        Rule  r2 = new Rule();
        r2.setMaxVersion("1.5代");
        r2.setVersionType("MPU");
        r2.setRule("小于");
        r2.setSoftNum("V500012345");
        r2.setMinVersion("02");
        rules1.add(r1);
        rules1.add(r2);
        y1.setRules(rules1);


        EcuRule y2 = new EcuRule();

        y1.setEcuName("BCM");

        List<Rule> rules2 = new ArrayList<>();
        Rule  r3 = new Rule();
        r3.setMaxVersion("1代");
        r3.setVersionType("MCU");
        r3.setRule("大于");
        r3.setVersion("72");
        Rule  r4 = new Rule();
        r4.setMaxVersion("1.5代");
        r4.setVersionType("MPU");
        r4.setRule("大于");
        r4.setSoftNum("V500012345");
        r4.setMinVersion("02");
        rules1.add(r1);
        rules1.add(r2);
        y1.setRules(rules2);

        ecuRules.add(y1);
        ecuRules.add(y2);

        System.out.println("yilais: "+ ecuRules);



/*
        //map
        int a=2;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name",a);
        map.put("sex","女");
        System.out.println(map);//{sex=女, name=2}
        System.out.println("map通过键获取值："+map.get("sex"));

        //前端json格式的字符串----转为后端的java代码
        System.out.println("前端json格式的字符串----转为后端的java代码");
        String jsonStr = "{\"password\":123456,\"username\":\"张三\"}";//json格式的"字符串"！！！
        System.out.println("json格式的字符串"+jsonStr);//{"password":123456,"username":"张三"}
        net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(jsonStr);//json字符串-java的json对象
        System.out.println("json对象的属性："+jsonObject.getString("username"));

        //后端的java代码----转为前端json格式的字符串
        System.out.println("java代码封装为json字符串");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("username","张三");
        jsonObject1.put("password",123456);
        System.out.println("输出json字符串："+jsonObject1.toString());//json对象转为json字符串*/


    }
}

