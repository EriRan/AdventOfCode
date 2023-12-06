package fi.eriran._2023.day1;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrebuchetTasksTest {

    private TrebuchetTasks trebuchetTasks;

    @Mock
    private ValueFinder mockValueFinder;

    @BeforeEach
    public void setup() {
        trebuchetTasks = new TrebuchetTasks();
        when(mockValueFinder.find(anyString())).thenReturn(1);
        trebuchetTasks.setValueFinder(mockValueFinder);
    }


    @Test
    void exampleCase() {
        // The file passed here has 4 lines
        List<String> input = new MultiLineInputParserProxy().parse("2023/day1");
        // Just test that this class can calculate sums coming from value finders
        assertEquals(4, trebuchetTasks.findSum(input));
    }
}