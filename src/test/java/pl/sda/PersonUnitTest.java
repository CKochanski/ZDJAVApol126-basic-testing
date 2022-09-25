package pl.sda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PersonUnitTest {

    @Test
    void shouldCreatePerson() {
        //when
        Person person = Person.create("Jan", "Kowalski", 31);

        //then
        assertNotNull(person);
        assertEquals("Jan", person.getFirstName());
        assertEquals("Kowalski", person.getLastName());
    }

    @Test
    void shouldReturnFullName() {
        //given
        Person person = Person.create("Jan", "Kowalski", 31);

        //when
        String fullName = person.getFullName();

        //then
        assertEquals("Jan Kowalski", fullName);
    }

}
