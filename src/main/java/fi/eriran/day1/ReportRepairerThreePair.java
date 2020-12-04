package fi.eriran.day1;

import java.util.List;

import static fi.eriran.day1.constant.ReportConstant.NUMBER_TO_FIND;

/**
 * Part three
 */
public class ReportRepairerThreePair implements ReportRepairer {

    @Override
    public int repair(List<Integer> input) {
        for (int leftPointer = 0; leftPointer < input.size() - 2; leftPointer++) {
            int leftNumber = input.get(leftPointer);
            for (int midPointer = leftPointer + 1; midPointer < input.size() - 1; midPointer++) {
                int midNumber = input.get(midPointer);
                for (int rightPointer = midPointer + 1; rightPointer < input.size(); rightPointer++) {
                    int rightNumber = input.get(rightPointer);
                    if (leftNumber + midNumber + rightNumber == NUMBER_TO_FIND) {
                        return leftNumber * midNumber * rightNumber;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Unable to find numbers that add up to " + NUMBER_TO_FIND + "!");
    }
}
