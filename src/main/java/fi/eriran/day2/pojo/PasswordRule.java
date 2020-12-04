package fi.eriran.day2.pojo;

public class PasswordRule {

    //Min in part one, point one in part two
    private int valueOne;
    //Max in part two, point two in part two
    private int valueTwo;
    private char targetCharacter;

    public PasswordRule(int valueOne, int valueTwo, char targetCharacter) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.targetCharacter = targetCharacter;
    }

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public char getTargetCharacter() {
        return targetCharacter;
    }

    public void setTargetCharacter(char targetCharacter) {
        this.targetCharacter = targetCharacter;
    }
}
