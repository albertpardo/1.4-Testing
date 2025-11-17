package level1ex3;

public class ThrowException {
    public static int getIntValue(int index) throws ArrayIndexOutOfBoundsException{
            int[] arrayInts = new int[3];

            if (index < 0 && index > arrayInts.length)
                throw new ArrayIndexOutOfBoundsException("Index outside Array Range!!");
            return arrayInts[index];
     }
}
