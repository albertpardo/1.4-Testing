package level2ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MyOwnIntArrayTest {

    @Test
    @DisplayName("check that two integer arrays are identical")
    void check_that_two_integer_arrays_are_identical(){
        int [] arrayOne = MyOwnIntArray.constantArray();
        int [] arrayTwo = MyOwnIntArray.constantArray();

        assertThat(arrayOne).isEqualTo(arrayTwo);
    }

}