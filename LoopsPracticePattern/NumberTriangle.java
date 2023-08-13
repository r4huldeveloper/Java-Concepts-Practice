import java.util.*;
public class NumberTriangle {
    public static void main(String args[]) {
        /*
        1 2 3 4
        5 6 7
        8 9
        10
        
        */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n + 1 - i; j++){
                System.out.print(count +"  ");
                count++;
            }
       System.out.println();
        }
    }
}
