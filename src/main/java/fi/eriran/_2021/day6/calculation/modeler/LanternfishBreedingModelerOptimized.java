package fi.eriran._2021.day6.calculation.modeler;

import fi.eriran._2021.day6.constant.LanternfishConstant;
import fi.eriran._2021.day6.parser.objects.Lanternfish;

import java.util.Collection;

/**
 * Needed for part two so that we won't run out of memory
 */
public class LanternfishBreedingModelerOptimized {

    public long[] model(Collection<Lanternfish> initialLanternfish, int days) {
        // Each index contains count of fish in that time of breeding
        long[] fishBreedingStates = new long[LanternfishConstant.POSSIBLE_DAYS_INDEX];

        // Add initial data based on the provided initial lanterfish
        initialLanternfish.forEach(lanternfish -> fishBreedingStates[lanternfish.getTimeToBreed()]++);

        int elapsedDays = 0;
        while (elapsedDays < days) {
            // Process days 1-8
            // Move fishes with days 1-8 to next day
            long fishFromLastMove = 0L;
            for (int i = LanternfishConstant.POSSIBLE_DAYS_INDEX - 1; i > 0; i--) {
                // All fish from last possible day move to next one
                long fishAlreadyOnDay = fishBreedingStates[i];
                fishBreedingStates[i] = fishFromLastMove;
                fishFromLastMove = fishAlreadyOnDay;
            }
            // Process day zero:
            // Existing fish move to day 6, so we increment their count with the current count on that day
            fishBreedingStates[LanternfishConstant.BREED_TIME_AFTER_RESET] = fishBreedingStates[LanternfishConstant.BREED_TIME_AFTER_RESET] + fishBreedingStates[0];
            // Create same count into day 8 as newborn fish
            fishBreedingStates[LanternfishConstant.BREED_TIME_NEW_FISH] = fishBreedingStates[0];
            // Finally, move the fish from day 1 into day zero
            fishBreedingStates[0] = fishFromLastMove;
            elapsedDays++;
        }
        return fishBreedingStates;
    }
}
