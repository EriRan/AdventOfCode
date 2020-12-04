package fi.eriran.day1;

import java.util.List;

import static fi.eriran.day1.constant.ReportConstant.NUMBER_TO_FIND;

/**
 * Part one
 */
class ReportRepairerTwoPair implements ReportRepairer {

    public int repair(List<Integer> input) {
        for (int leftPointer = 0; leftPointer < input.size(); leftPointer++) {
            for (int rightPointer = input.size() - 1; rightPointer > leftPointer; rightPointer--) {
                Integer leftNumber = input.get(leftPointer);
                Integer rightNumber = input.get(rightPointer);
                if (leftNumber + rightNumber == NUMBER_TO_FIND) {
                    return leftNumber * rightNumber;
                }
            }
        }
        throw new IllegalArgumentException("Unable to find numbers that add up to " + NUMBER_TO_FIND + "!");
    }
}
