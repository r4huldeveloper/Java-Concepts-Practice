import java.util.*;
public class TrianglePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

----------------------------------------
With While-Loop

    import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
             System.out.println();
             i++;
            }
         sc.close();
        }
    }

