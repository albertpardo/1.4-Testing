package level2ex5;

import java.util.HashMap;
import java.util.Map;

public class MyMapClass {

    public static Map<String,Integer> createMyMap() {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("uno", 1);

        return myMap;
    }


}
