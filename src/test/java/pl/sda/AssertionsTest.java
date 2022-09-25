package pl.sda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    @Test
    void testNotNull() {
        String text = "sdacademy";

        assertNotNull(text, "text should not be null");
    }

    @Test
    void shouldBeNull() {
        String text = null;

        assertNull(text, "Text should be null");
    }

    @Test
    void shouldBeTrue() {
        boolean value = true;

        assertTrue(value, "value should be true");
    }

    @Test
    public void shouldBeFalse() {
        boolean value = false;

        assertFalse(value, "Testowanie za pomocą assertFalse");
    }

    @Test
    void bothArraysShouldBeEqual() {
        final int[] intsA = { 1, 2, 3 };
        final int[] intsB = { 1, 2, 3 };

        assertArrayEquals(intsA, intsB, "Elements in arrays are not equals");
    }

    @Test
    void twoListsShouldBeEqual() {
        List<Integer> intsA = Arrays.asList(1, 2, 3);
        List<Integer> intsB = List.of(1, 2, 3);

        assertIterableEquals(intsA, intsB);
    }

    @Test
    void bothArraysShouldBeEqualInSingleAssertion() {
        List<Integer> ints = Arrays.asList(1, 3, 2);

        assertAll(
                () -> assertEquals(3, ints.size()),
                () -> assertEquals(2, ints.get(2))
        );
    }

}
