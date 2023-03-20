import java.lang.Math;
import java.util.Random;

public class Main {
  public static void main(String[] args){
  
  Random random = new Random();
  
  // GENERATING THE RANDOM NUMBER BETWEEN THE GIVEN RANGE OF INTEGER (0 TO -1)
  int x = random.nextInt(10);
  int y = random.nextInt(100);
  
  System.out.println(x);
  System.out.println(y);
  
  // GENERATE THE RANDOM NUMBER BETWEEN THE GIVEN DOUBLE VALUE(0.0 TO 1.0(EXCULSIVE))
  double a = random.nextDouble();
  double b = random.nextDouble();
  
  System.out.println(a);
  System.out.println(b);
  
  }
}
