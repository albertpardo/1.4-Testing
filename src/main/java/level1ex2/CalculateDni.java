package level1ex2;

public class CalculateDni {
    private static final char[] DNI_CHARS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public static Character calculateDniChar(int dniNumber){
        int indexChar = dniNumber % 23;
        return DNI_CHARS[indexChar];
    }
}
