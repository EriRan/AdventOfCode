package fi.eriran.testcommon.util;

import java.util.Collection;
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
}
