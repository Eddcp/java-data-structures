package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

class SpiralMatrixTest {

    @InjectMocks
    SpiralMatrix spiralMatrix;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnSpiralList() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        var list = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        var resultList = spiralMatrix.process(matrix);
        Assertions.assertEquals(resultList, list);
    }
}
