package level2ex6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ThrowExceptionTest {

    @Test
    @DisplayName("check that an ArrayIndexOutOfBoundsException is throw")
    void check_that_an_ArrayIndexOutOfBoundsException_is_throw(){
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {
            int x = ThrowException.getIntValue(200);
        });
    }
}