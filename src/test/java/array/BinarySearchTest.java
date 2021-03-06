package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

class BinarySearchTest {

    @InjectMocks
    BinarySearch binarySearch;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldFindElement() {
        var list = new int[]{1, 3, 5, 8, 12, 34, 35};
        var result = binarySearch.process(list, 8);
        Assertions.assertEquals(3, result);
    }
}
