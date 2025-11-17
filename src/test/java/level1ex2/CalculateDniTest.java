package level1ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "29876543, A",
            "23456789, D",
            "87654321, X",
            "34567890, V",
            "76543210, S",
            "45678901, G",
            "65432109, F",
            "56789012, B",
            "45768543, S"
    })
    @DisplayName("check using a list of test numbers that the result is the expected char")

    void check_result_char_for_dni(int dniNum, char expectedChar) {
        assertEquals(expectedChar, CalculateDni.calculateDniChar(dniNum));
    }
}