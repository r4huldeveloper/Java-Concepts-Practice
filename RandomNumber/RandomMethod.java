import java.lang.Math;
public class Main {
  public static void main(String[] args) {
  System.out.println("1st number: "+Math.random());  // PRINT THE NUMBER BETWEEN INCLUSIVE 0.0 , EXCLUSIVE 1.0
  System.out.println("2nd number: " +Math.random());
  
  // GENERATE THE RANDOM NUMBER BETWEEN RANGE
  
  int max = 600;
  int min = 300;
  
  double dbl = Math.random()*(max-min+1) + min;
  System.out.println("double random between the limit: " + dbl);
  
  int in = (int)Math.random()*(max-min+1) + min;
  System.out.println("int random between the limit: " + in);
  
  
  }
}
