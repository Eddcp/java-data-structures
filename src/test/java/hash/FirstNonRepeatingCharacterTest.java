package hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

class FirstNonRepeatingCharacterTest {

    @InjectMocks
    FirstNonRepeatingCharacter firstNonRepeatingCharacter;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldMoveZeroes() {
        var list = "abcabcdaa";
        var result = firstNonRepeatingCharacter.process(list);
        Assertions.assertEquals('d', result);
    }
}
