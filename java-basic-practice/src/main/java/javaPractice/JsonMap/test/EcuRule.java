package javaPractice.JsonMap.test;


import java.util.List;

public class EcuRule {
    public String ecuName;
    public List<Rule> rules;

    public String getEcuName() {
        return ecuName;
    }

    public void setEcuName(String ecuName) {
        this.ecuName = ecuName;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
