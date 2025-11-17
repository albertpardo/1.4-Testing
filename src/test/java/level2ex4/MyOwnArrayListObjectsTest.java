package level2ex4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MyOwnArrayListObjectsTest {
    @Test
    @DisplayName("check that one arrayList have objects in the same order that are inserted")
    public void check_that_one_arrayList_have_objects_in_the_same_order_that_are_inserted(){
        String stringOne = "StringOne";
        String stringTwo = "StringTwo";
        Integer number = 5;

        MyOwnArrayListObjects myObjectWithArrayListOfObjects = new MyOwnArrayListObjects();
        myObjectWithArrayListOfObjects.addObject(stringOne);
        myObjectWithArrayListOfObjects.addObject(number);
        myObjectWithArrayListOfObjects.addObject(stringTwo);
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsExactly(stringOne, number, stringTwo);
    }

    @Test
    @DisplayName("check that one arrayList have objects any order")
    public void check_that_an_arrayList_have_objects_in_any_order(){
        String stringOne = "StringOne";
        String stringTwo = "StringTwo";
        Integer number = 5;

        MyOwnArrayListObjects myObjectWithArrayListOfObjects = new MyOwnArrayListObjects();
        myObjectWithArrayListOfObjects.addObject(stringOne);
        myObjectWithArrayListOfObjects.addObject(number);
        myObjectWithArrayListOfObjects.addObject(stringTwo);
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsExactlyInAnyOrder(number, stringOne, stringTwo);
    }

    @Test
    @DisplayName("check that one arrayList one object appears only once time")
    public void check_that_one_arrayList_one_object_appears_only_once_time(){
        String stringOne = "StringOne";
        String stringTwo = "StringTwo";
        Integer number = 5;

        MyOwnArrayListObjects myObjectWithArrayListOfObjects = new MyOwnArrayListObjects();
        myObjectWithArrayListOfObjects.addObject(stringOne);
        myObjectWithArrayListOfObjects.addObject(number);
        myObjectWithArrayListOfObjects.addObject(stringTwo);
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).containsOnlyOnce(number);
    }

    @Test
    @DisplayName("check that one arrayList one object does not appears")
    public void check_that_one_arrayList_one_object_does_not_appears(){
        String stringOne = "StringOne";
        String stringTwo = "StringTwo";
        Integer number = 5;

        MyOwnArrayListObjects myObjectWithArrayListOfObjects = new MyOwnArrayListObjects();
        myObjectWithArrayListOfObjects.addObject(stringOne);
        myObjectWithArrayListOfObjects.addObject(number);
        assertThat(myObjectWithArrayListOfObjects.getArrayList()).doesNotContain(stringTwo);
    }

}