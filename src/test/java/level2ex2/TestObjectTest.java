package level2ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TestObjectTest {

    @Test
    @DisplayName("check that two objects have the same reference")
    void check_that_two_objects_have_the_same_reference(){
        String nameOne = "Pepe";

        TestObject testObjectOne = new TestObject(nameOne);
        TestObject testObjectTwo = testObjectOne;

        assertThat(testObjectOne).isSameAs(testObjectTwo);
    }

    @Test
    @DisplayName("check that two objects do not have the same reference")
    void check_that_two_objects_do_not_have_the_same_reference(){
        String nameOne = "Pepe";
        String nameTwo = "Sol";

        TestObject testObjectOne = new TestObject(nameOne);
        TestObject testObjectTwo = new TestObject(nameTwo);

        assertThat(testObjectOne).isNotSameAs(testObjectTwo);
    }

}