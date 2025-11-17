package level2ex7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyOptionalEmptyTest {

    @Test
    @DisplayName("check that an object is empty")
    void check_that_an_object_is_empty(){
        Optional<String> myOptionalTest = MyOptionalEmpty.createOptionalEmpty();

        assertThat(myOptionalTest).isEmpty();
    }
}