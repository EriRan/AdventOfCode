package fi.eriran.day10.calculation;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class AdapterPossibleCombinationsCounter {

    public long count(List<Integer> availableAdapters) {
        int theLastAdapter = availableAdapters.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalStateException("Unable to find max value")) + 3;
        List<Integer> reversedAdapterList = createReversedAdapterList(availableAdapters, theLastAdapter);

        Map<Integer, Set<Integer>> graph = new HashMap<>();
        reversedAdapterList.forEach(adapter -> {
            graph.put(adapter, new HashSet<>());
        });
        for (int i = 0; i < reversedAdapterList.size(); i++) {
            Integer currentJoltage = reversedAdapterList.get(i);
            for (int j = i + 1; j < reversedAdapterList.size(); j++) {
                Integer possibleNeighbour = reversedAdapterList.get(j);
                if (currentJoltage - possibleNeighbour  < 4) {
                    graph.get(currentJoltage).add(possibleNeighbour);
                }
            }
        }

        Map<Integer, Long> waysToPoints = new HashMap<>();

        for (Integer adapter : graph.keySet()) {
            waysToPoints.put(adapter, 1L);
        }

        for (int i = reversedAdapterList.size() - 1; i >= 0; i--) {
            Integer currentAdapter = reversedAdapterList.get(i);
            Set<Integer> currentAdapterNeighbours = graph.get(currentAdapter);

            //Zero has no neighbours so it will end up here
            if (CollectionUtils.isEmpty(currentAdapterNeighbours)) {
                continue;
            }

            Long waysToPoint = currentAdapterNeighbours.stream()
                    .map(waysToPoints::get)
                    .filter(Objects::nonNull)
                    .reduce(Long::sum)
                    .orElse(1L);
            waysToPoints.put(currentAdapter, waysToPoint);
        }

        return waysToPoints.get(theLastAdapter);
    }

    private List<Integer> createReversedAdapterList(List<Integer> availableAdapters, int theLastAdapter) {
        List<Integer> copiedAdapters = new ArrayList<>();
        copiedAdapters.add(0);
        copiedAdapters.add(theLastAdapter);
        copiedAdapters.addAll(availableAdapters);
        List<Integer> sortedAdapters = copiedAdapters.stream()
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(sortedAdapters);
        return sortedAdapters;
    }
}
