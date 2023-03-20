public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a); // convert int to Integer object explicitly

        Integer way = a;  // AUTOBOXING , COMPILER WILL WRITE THIS (Integer.valueOf(a)) INTERNALLY

        System.out.println(a+" "+i+" "+way);

        // UNBOXING = TO CONVERT OBJECT TO PRIMITIVE DATATYPE
        Integer b = 100;
        int x = b.intValue(); // convert the object b into int i.e. primitive

        int y = b; // UNBOXING, COMPILER WILL WRITE THIS b.intValue() INTERNALLY

        System.out.println(b+" "+x+" "+y);

    }
}
