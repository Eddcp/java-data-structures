package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

class RotateImageTest {

    @InjectMocks
    RotateImage rotateImage;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldRotateMatrix() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        rotateImage.process(matrix);
        Assertions.assertArrayEquals(result, matrix);
    }
}
