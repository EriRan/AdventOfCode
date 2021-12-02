package fi.eriran.twozerotwozero.day10.calculation;

import fi.eriran.twozerotwozero.day10.calculation.util.LastAdapterFinder;

import java.util.*;
import java.util.stream.Collectors;

public class AdapterPossibleCombinationsCounter {

    /**
     * Count all possible combinations that adapters can be attached together to form a chain to reach the last
     * adapter.
     * <p>
     * This is done by creating a kind of graph of the adapters and possible adapters that can be connected to them.
     * and then summing together the possible ways to the adapters. The count is taken from the possible way count
     * of the last adapter in the chain.
     */
    public long count(List<Integer> availableAdapters) {
        int theLastAdapter = LastAdapterFinder.find(availableAdapters);
        //Create a copy of the provided adapters so that we can modify it freely and arrenge all of the adapters in a
        // reverse order so that we can use positive indexes in the later iterations
        List<Integer> reversedAdapterList = createReversedAdapterList(availableAdapters, theLastAdapter);

        //This contains all adapters and how their neighbours
        Map<Integer, Set<Integer>> neighbourAmountMap = createNeighbourAmountGraph(reversedAdapterList);
        //This contains the amount of possible paths to access a certain adapter
        Map<Integer, Long> waysToAdapters = createWayCountToAdapterMap(reversedAdapterList, neighbourAmountMap);

        //Return the amount of paths to the last adapter, which is the answer to part two
        return waysToAdapters.get(theLastAdapter);
    }

    private List<Integer> createReversedAdapterList(List<Integer> availableAdapters, int theLastAdapter) {
        List<Integer> copiedAdapters = new ArrayList<>();
        //Add the first adapter which has a zero joltage
        copiedAdapters.add(0);
        copiedAdapters.add(theLastAdapter);
        copiedAdapters.addAll(availableAdapters);

        //Create a sorted copy of the list
        List<Integer> sortedAdapters = copiedAdapters.stream()
                .sorted()
                .collect(Collectors.toList());

        Collections.reverse(sortedAdapters);
        return sortedAdapters;
    }

    private Map<Integer, Set<Integer>> createNeighbourAmountGraph(List<Integer> adapters) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        //Initialize all adapter values to have an empty set.
        //This has to be done this way so that the adapter with zero joltage gets at least an empty collection so
        // that the zero is included in the way count
        adapters.forEach(adapter -> graph.put(adapter, new HashSet<>()));
        for (int i = 0; i < adapters.size(); i++) {
            Integer currentJoltage = adapters.get(i);
            for (int j = i + 1; j < adapters.size(); j++) {
                Integer possibleNeighbour = adapters.get(j);
                //Possible neighbour will always be less than the current because the adapter list should be in
                // reverse order at this point
                if (currentJoltage - possibleNeighbour  < 4) {
                    graph.get(currentJoltage).add(possibleNeighbour);
                }
            }
        }
        return graph;
    }

    private Map<Integer, Long> createWayCountToAdapterMap(List<Integer> adapters,
                                                          Map<Integer, Set<Integer>> neighbourAmountMap) {
        Map<Integer, Long> waysToAdapters = createWayCountMap(adapters);

        for (int i = adapters.size() - 1; i >= 0; i--) {
            Integer currentAdapter = adapters.get(i);
            Set<Integer> currentAdapterNeighbours = neighbourAmountMap.get(currentAdapter);

            //Count the amount of ways there exists for the current adapter through its neighbours
            //Sum the amount of ways of the neighbours together
            Long waysToPoint = currentAdapterNeighbours.stream()
                    .map(waysToAdapters::get)
                    .filter(Objects::nonNull)
                    .reduce(Long::sum)
                    .orElse(1L);
            waysToAdapters.put(currentAdapter, waysToPoint);
        }
        return waysToAdapters;
    }

    /**
     * Create a map with all provided adapter values initialized as 1
     */
    private Map<Integer, Long> createWayCountMap(Collection<Integer> adapters) {
        Map<Integer, Long> waysToPoints = new HashMap<>();

        for (Integer adapter : adapters) {
            waysToPoints.put(adapter, 1L);
        }
        return waysToPoints;
    }
}
