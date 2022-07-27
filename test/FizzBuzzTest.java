import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void when_input_is_10 () {
        //given
        int n = 10;

        //when
        List<String> actual = FizzBuzz.fizzbuzz(n);
        List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"});

        //assert
        assertNotNull(actual);
        assertEquals(actual.get(0), expected.get(0));
        assertEquals(expected.toString(), actual.toString());
    }
}