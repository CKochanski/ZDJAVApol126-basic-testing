package pl.sda;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAllTest {

    @BeforeAll
    static void setUpTestCase() {
        System.out.println("Ten komunikat wyświetli się raz przed wykonaniem wszystkich metod testujących");
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
