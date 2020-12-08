package fi.eriran.testcommon.util;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Outboxer {

    private Outboxer() {
    }

    public static <T> T getFirst(Collection<T> collection) {
        Optional<T> firstOfTheCollection = collection.stream().findFirst();
        assertTrue(firstOfTheCollection.isPresent());
        return firstOfTheCollection.get();
    }

    public static <K, V> V getFirstValue(Map<K, V> map) {
        Optional<V> firstOfTheCollection = map.values().stream().findFirst();
        assertTrue(firstOfTheCollection.isPresent());
        return firstOfTheCollection.get();
    }
}
