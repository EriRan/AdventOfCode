package fi.eriran.twozerotwozero.day10.calculation;

import fi.eriran.twozerotwozero.day10.pojo.JoltDifferencesContainer;

import java.util.List;
import java.util.stream.Collectors;

public class JoltDifferenceContainerFactory {

    public JoltDifferencesContainer find(List<Integer> availableAdapters) {
        List<Integer> sortedAdapters = availableAdapters.stream().sorted().collect(Collectors.toList());
        JoltDifferencesContainer differencesContainer = new JoltDifferencesContainer();

        int currentEffectiveRating = 0;

        for (Integer adapterJoltage : sortedAdapters) {
            int newDifference = adapterJoltage - currentEffectiveRating;
            addNewJoltage(differencesContainer, newDifference);
            currentEffectiveRating = adapterJoltage;
        }

        differencesContainer.setThreeJolts(differencesContainer.getThreeJolts() + 1);
        return differencesContainer;
    }

    private void addNewJoltage(JoltDifferencesContainer differencesContainer, int newDifference) {
        switch (newDifference) {
            case 1:
                differencesContainer.setOneJolts(differencesContainer.getOneJolts() + 1);
                break;
            case 2:
                differencesContainer.setTwoJolts(differencesContainer.getTwoJolts() + 1);
                break;
            case 3:
                differencesContainer.setThreeJolts(differencesContainer.getThreeJolts() + 1);
                break;
            default:
                throw new IllegalArgumentException("Unable to build a full adapter chain. Last encountered " +
                        "difference: " + newDifference);
        }
    }
}
