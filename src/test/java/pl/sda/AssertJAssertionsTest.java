package pl.sda;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AssertJAssertionsTest {

    @Test
    void shouldGetFullName() {
        //given
        String name = "Jan";
        String lastName = "Kowalski";
        final Person person = Person.create(name, lastName);

        //when
        String actual = person.getFullName();

        //then
        assertThat(actual)
                .startsWith(name)
                .endsWith(lastName)
                .contains(" ");
    }

    @Test
    void shouldReverseOrderAndCopyList() {
        //given
        List<String> testedList = new ArrayList<>(List.of("raz", "dwa", "trzy"));

        //when
        Collections.reverse(testedList);

        //then
        assertThat(testedList)
                .isNotEmpty()
                .containsExactly("trzy", "dwa", "raz");
    }

    @Test
    void shouldContainAnyValueFromOtherList() {
        //given
        List<Integer> integers = List.of(13, 24, 11, 23, 10);

        //then
        assertThat(integers)
                .containsAnyOf(13, 11, 25);
    }

    @Test
    void shouldContainValues() {
        //given
        List<Integer> integers = List.of(13, 24, 11, 23, 10);

        //then
        assertThat(integers)
                .contains(13, 11);
    }

    @Test
    @Disabled
    void shouldNotContainAnyWhitespace() {
        //given
        String name = "Jan";
        String lastName = "Kowalski";
        final Person person = Person.create(name, lastName);

        //when
        String actual = person.getFullName();

        //then
        assertThat(actual)
                .doesNotContainAnyWhitespaces();
    }

}
