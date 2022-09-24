package pl.sda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OurFirstUnitTest { // klasa testowa

    @Test // adnotacja oznaczająca, że metoda jest testem
    void shouldMultiplyTwoNumbers() { // sygnatura metody testowej w przeciwienstwie do JUnit4 nie musi być publiczna
        // given // warunki początkowe
        final double firstNumber = 2;
        final double secondNumber = 3;

        // when // wykonanie testu
        final double multiplicationResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        assertEquals(6, multiplicationResult);
    }

}
