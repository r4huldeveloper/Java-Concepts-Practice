public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 40;
        int b = 0;
        try
        {
            int data = a/b;

        } catch (ArithmeticException e)
        {
            System.out.println("You can't divide by zero");
            System.out.println(a/(b+5));
        }
            System.out.println("i love you guys");
        }
    }

