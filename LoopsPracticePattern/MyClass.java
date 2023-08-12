// With While Loop

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        1 1 1
        2 2 2
        3 3 3
        */
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}

-----------------------------------------------
// With FOR-LOOP METHOD

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        1 1 1
        2 2 2
        3 3 3
        */
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
