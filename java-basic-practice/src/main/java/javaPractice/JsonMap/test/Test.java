package javaPractice.JsonMap.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<EcuRule> yilaiList = new ArrayList<EcuRule>();


        EcuRule y1 = new EcuRule();
        y1.setEcuName("TBOX");
        List<Rule> rules1 = new ArrayList<>();
        Rule  r1 = new Rule();
        r1.setMaxVersion("1代");
        r1.setVersionType("MCU");
        r1.setRule("小于");
        r1.setVersion("72");
        Rule r2 = new Rule();
        r2.setMaxVersion("1.5代");
        r2.setVersionType("MPU");
        r2.setRule("小于");
        r2.setSoftNum("V500012345");
        r2.setMinVersion("02");
        rules1.add(r1);
        rules1.add(r2);
        y1.setRules(rules1);
        System.out.println("y1:" + y1);


        EcuRule y2 = new EcuRule();
        y2.setEcuName("BCM");
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
        rules2.add(r3);
        rules2.add(r4);
        y2.setRules(rules2);
        System.out.println("y2:" + y2);

        yilaiList.add(y1);
        yilaiList.add(y2);

        //System.out.println(JSON.toJSONString(yilaiList));
    }
}
