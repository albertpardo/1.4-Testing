package level2ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class NewIntegerObjectTest {

    @Test
    @DisplayName("Check two integer are equals")
    void check_to_integer_are_equals() {
        int integer = 6;
        Integer integer1 = NewIntegerObject.createIntegerObject(integer);
        Integer integer2 = NewIntegerObject.createIntegerObject(integer);

        assertThat(integer1).isEqualTo(integer2);
    }

    @Test
    @DisplayName("Check two integer are not equals")
    void check_to_integer_are_not_equals() {
        int integerOne = 6;
        int integerTwo = 25;
        Integer integer1 = NewIntegerObject.createIntegerObject(integerOne);
        Integer integer2 = NewIntegerObject.createIntegerObject(integerTwo);

        assertThat(integer1).isNotEqualTo(integer2);
    }
}