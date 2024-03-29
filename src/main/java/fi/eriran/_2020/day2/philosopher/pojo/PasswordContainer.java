package fi.eriran._2020.day2.philosopher.pojo;

public class PasswordContainer {

    private PasswordRule rule;
    private String password;

    public PasswordContainer(PasswordRule rule, String password) {
        this.rule = rule;
        this.password = password;
    }

    public PasswordRule getRule() {
        return rule;
    }

    public void setRule(PasswordRule rule) {
        this.rule = rule;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
