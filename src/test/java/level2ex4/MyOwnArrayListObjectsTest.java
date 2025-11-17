package level2ex4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MyOwnArrayListObjectsTest {
    private static String STRING_ONE = "StringOne";
    private static String STRING_TWO = "StringTwo";
    private static Integer NUMBER = 5;

    private MyOwnArrayListObjects myObjectWithArrayListOfObjects;
    private MyOwnArrayListObjects myObjectWithArrayListOfObjectsTwo;

    @BeforeEach
    void createObjects(){
        myObjectWithArrayListOfObjects = new MyOwnArrayListObjects();
        myObjectWithArrayListOfObjectsTwo = new MyOwnArrayListObjects();

        myObjectWithArrayListOfObjects.addObject(STRING_ONE);
        myObjectWithArrayListOfObjects.addObject(NUMBER);
        myObjectWithArrayListOfObjects.addObject(STRING_TWO);

        myObjectWithArrayListOfObjectsTwo.addObject(STRING_ONE);
        myObjectWithArrayListOfObjectsTwo.addObject(NUMBER);
    }

    @Test
    @DisplayName("check that one arrayList have objects in the same order that are inserted")
    public void check_that_one_arrayList_have_objects_in_the_same_order_that_are_inserted(){
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsExactly(STRING_ONE, NUMBER, STRING_TWO);
    }

    @Test
    @DisplayName("check that one arrayList have objects any order")
    public void check_that_an_arrayList_have_objects_in_any_order(){
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsExactlyInAnyOrder(NUMBER, STRING_ONE, STRING_TWO);
    }

    @Test
    @DisplayName("check that one arrayList one object appears only once time")
    public void check_that_one_arrayList_one_object_appears_only_once_time(){
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsOnlyOnce(NUMBER);
    }

    @Test
    @DisplayName("check that one arrayList one object does not appears")
    public void check_that_one_arrayList_one_object_does_not_appears(){
        assertThat(myObjectWithArrayListOfObjectsTwo.getArrayList()).doesNotContain(STRING_TWO);
    }
}