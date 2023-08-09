public class MyClass {
    public static void main(String args[]) {
        int i = 0, flag = 0, m;
        
        int checkedNumber  = 12;
        
        m = checkedNumber / 2;
        
        if(checkedNumber == 0 || checkedNumber ==2){
            System.out.println(checkedNumber +" is not a prime number.");
        } else{
            for( i = 2; i <= m; i++){
                if(checkedNumber % i == 0){
                    System.out.println(checkedNumber+" is not a prime number.");
                    flag = 1;
                    break;
                }
            }
        } // end of else
        if(flag == 0){
            System.out.println(checkedNumber+" is a prime number.");
        }
    }
}
