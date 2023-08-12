import java.util.*;
public class CharacterPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        A A A A
        B B B B 
        C C C C
        D D D D
        */
        int i = 1;
        while(i <= n){
            char ch = (char)('A' + i - 1);
            int j = 1;
            while(j <= n){
                System.out.print(ch+" ");
                j++;
            }
             System.out.println();
             i++;
            }
         sc.close();
        }
    }
