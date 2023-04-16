import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//     int count = 0;
//     while(num != 0){
//         num /= 10;
//         count++;
//
//        }
        int inv = 0; // inverted digit taken as 0  at starting because  we don't have anything to put the inverse value of given value in it.
        int op = 1;  // original position taken as from the user given number and we will count the number from 1st position.
        while( num != 0){
          int od = num %10;  // So now we are taking the original value at op =1 and that will be present as original digit of the user defined number.
            int ip = od;     // Now we are making inverted position equal to  the original digit as a position.
            int id = op;     // In this we are making inverted digit equal to original position.
            inv = inv + id * (int)Math.pow(10,ip-1); // Here we are putting the taken ip and id to place the inverted digit to inverted position.
            num = num / 10;  // Here we are taking the remainder of remaining number given by the user i.e. nums.
            op++;   // Here we are increasing the original value by 1.
        }
        System.out.println(inv);
    }
}
