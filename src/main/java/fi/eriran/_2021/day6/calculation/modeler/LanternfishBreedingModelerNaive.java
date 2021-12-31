package fi.eriran._2021.day6.calculation.modeler;

import fi.eriran._2021.day6.constant.LanternfishConstant;
import fi.eriran._2021.day6.parser.objects.Lanternfish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LanternfishBreedingModelerNaive {

    public List<Lanternfish> model(Collection<Lanternfish> initialLanternfish, int days) {
        // Create copy of the collection and all objects in it
        List<Lanternfish> modelledLanterfish = initialLanternfish.stream()
                .map(lanternfish -> new Lanternfish(lanternfish.getTimeToBreed()))
                .collect(Collectors.toList());
        int elapsedDays = 0;
        while (elapsedDays < days) {
            Collection<Lanternfish> bornLanternfish = new ArrayList<>();
            modelledLanterfish.forEach(lanternfish -> {
                if (lanternfish.getTimeToBreed() == 0) {
                    lanternfish.setTimeToBreed(LanternfishConstant.BREED_TIME_AFTER_RESET);
                    bornLanternfish.add(new Lanternfish(LanternfishConstant.BREED_TIME_NEW_FISH));
                } else {
                    lanternfish.setTimeToBreed(lanternfish.getTimeToBreed() - 1);
                }
            });
            modelledLanterfish.addAll(bornLanternfish);
            elapsedDays++;
        }
        return modelledLanterfish;
    }
}
