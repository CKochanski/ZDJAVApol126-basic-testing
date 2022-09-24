package pl.sda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEachTest {

    @BeforeEach
    void setUp() {
        System.out.println("Ten komunikat wyświetli się przed wykonaniem każdej z metod testujących");
    }

    @Test
    void firstTest() {
        System.out.println("Wykonuję test pierwszy...");
    }

    @Test
    void secondTest() {
        System.out.println("Wykonuję test drugi...");
    }

}
