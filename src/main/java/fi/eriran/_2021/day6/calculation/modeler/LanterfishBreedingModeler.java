package fi.eriran._2021.day6.calculation.modeler;

import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran._2021.day6.parser.objects.Lanterfish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LanterfishBreedingModeler {

    public List<Lanterfish> model(Collection<Lanterfish> initialLanterfish, int days) {
        // Create copy of the collection and all objects in it
        List<Lanterfish> modelledLanterfish = initialLanterfish.stream()
                .map(lanterfish -> new Lanterfish(lanterfish.getTimeToBreed()))
                .collect(Collectors.toList());
        int elapsedDays = 0;
        while (elapsedDays < days) {
            Collection<Lanterfish> bornLanterfish = new ArrayList<>();
            modelledLanterfish.forEach(lanterfish -> {
                if (lanterfish.getTimeToBreed() == 0) {
                    lanterfish.setTimeToBreed(LanterfishConstant.BREED_TIME_AFTER_RESET);
                    bornLanterfish.add(new Lanterfish(LanterfishConstant.NEW_FISH_TIME_TO_BREED));
                } else {
                    lanterfish.setTimeToBreed(lanterfish.getTimeToBreed() - 1);
                }
            });
            modelledLanterfish.addAll(bornLanterfish);
            elapsedDays++;
        }
        return modelledLanterfish;
    }
}
