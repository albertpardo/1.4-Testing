package level1ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowExceptionTest {

    @Test
    @DisplayName("Check to detect ArrayIndexOutOfBoundsException")
    void check_detect_ArrayIndexOutOfBoundsException(){
        ArrayIndexOutOfBoundsException err = assertThrows(ArrayIndexOutOfBoundsException.class, () -> ThrowException.getIntValue(400));
    }
}