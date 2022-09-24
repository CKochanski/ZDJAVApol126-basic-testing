package pl.sda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AfterEachTest {

    @AfterEach
    void tearDown() {
        System.out.println("Ten komunikat wyświetli się po wykonaniu każdej z metod testujących");
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
