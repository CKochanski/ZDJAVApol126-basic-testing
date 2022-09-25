package pl.sda;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class AfterAllTest {

    @AfterAll
    static void tearDownTestCase() {
        System.out.println("Ten komunikat wyświetli się raz po wykonaniu wszystkich metod testujących");
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
