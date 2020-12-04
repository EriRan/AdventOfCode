package fi.eriran.day2.pojo;

public class PasswordRule {

    private int min;
    private int max;
    private char targetCharacter;

    public PasswordRule(int min, int max, char targetCharacter) {
        this.min = min;
        this.max = max;
        this.targetCharacter = targetCharacter;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public char getTargetCharacter() {
        return targetCharacter;
    }

    public void setTargetCharacter(char targetCharacter) {
        this.targetCharacter = targetCharacter;
    }
}
