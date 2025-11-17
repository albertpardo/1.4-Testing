package level2ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class NewIntegerObjectTest {
    private static final int INT1 = 6;
    private static Integer integer1;
    private static Integer integer2;

    @BeforeEach
    void createObject(){
        integer1 = NewIntegerObject.createIntegerObject(INT1);
    }

    @Test
    @DisplayName("Check two integer are equals")
    void check_to_integer_are_equals() {
        integer2 = NewIntegerObject.createIntegerObject(INT1);
        assertThat(integer1).isEqualTo(integer2);
    }

    @Test
    @DisplayName("Check two integer are not equals")
    void check_to_integer_are_not_equals() {
        int integerTwo = 25;
        integer2 = NewIntegerObject.createIntegerObject(integerTwo);
        assertThat(integer1).isNotEqualTo(integer2);
    }
}