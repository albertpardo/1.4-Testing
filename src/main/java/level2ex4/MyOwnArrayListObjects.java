package level2ex4;

import java.util.ArrayList;

public class MyOwnArrayListObjects {
    private ArrayList<Object> arrayList;

    public MyOwnArrayListObjects(){
        this.arrayList = new ArrayList<> ();
    }

    public void addObject(Object object){
        this.arrayList.add(object);
    }
    public ArrayList<Object> getArrayList(){
        return arrayList;
    }
}
