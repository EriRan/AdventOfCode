package fi.eriran.day1;

import java.util.List;
import java.util.stream.Collectors;

import static fi.eriran.day1.constant.ReportConstant.NUMBER_TO_FIND;

class ReportRepair {

    public int repair(List<Integer> input) {
        List<Integer> sortedInput = input.stream().sorted(Integer::compareTo).collect(Collectors.toList());

        int leftPointer = 0;
        int rightPointer = sortedInput.size() - 1;

        while (leftPointer < rightPointer) {
            Integer leftNumber = sortedInput.get(leftPointer);
            Integer rightNumber = sortedInput.get(rightPointer);
            if (leftNumber + rightNumber == NUMBER_TO_FIND) {
                return leftNumber * rightNumber;
            }
            leftPointer++;
            rightPointer--;
        }
        throw new IllegalArgumentException("Unable to find numbers that add up to " + NUMBER_TO_FIND + "!");
    }
}
