package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

class MoveZeroesTest {

    @InjectMocks
    MoveZeroes moveZeroes;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldFindElement() {
        var list = new int[]{0, 1, 0, 3, 12};
        var result = moveZeroes.process(list);
        var expected = new int[]{1, 3, 12, 0, 0};
        Assertions.assertArrayEquals(expected, result);
    }
}
