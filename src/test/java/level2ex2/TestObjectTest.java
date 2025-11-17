package level2ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TestObjectTest {
    private TestObject testObjectOne;
    private TestObject testObjectTwo;

    @BeforeEach
    void createObjects(){
        testObjectOne = new TestObject("Pepe");
    }

    @Test
    @DisplayName("check that two objects have the same reference")
    void check_that_two_objects_have_the_same_reference(){
       TestObject testObjectTwo = testObjectOne;
       assertThat(testObjectOne).isSameAs(testObjectTwo);
    }

    @Test
    @DisplayName("check that two objects do not have the same reference")
    void check_that_two_objects_do_not_have_the_same_reference(){
        final String NAME_TWO = "Sol";
        TestObject testObjectTwo = new TestObject(NAME_TWO);
        assertThat(testObjectOne).isNotSameAs(testObjectTwo);
    }

}