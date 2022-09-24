package pl.sda;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DisplayNameAndDisabledTest {

    @Test
    @DisplayName("Pierwsza metoda testująca")
    void firstTest() {
        System.out.println("Pierwszy test");
    }

    @Test
    @Disabled
    void secondTest() {
        System.out.println("test");
    }

}
