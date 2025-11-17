package level2ex5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class MyMapClassTest {

    @Test
    @DisplayName("chek that one Map has a key")
    void chek_that_one_Map_has_a_key(){
        Map<String, Integer> myMap = MyMapClass.createMyMap();
        String myTestString = "Test";

        myMap.put(myTestString, 5);
        assertThat(myMap).containsKey(myTestString);

    }

}