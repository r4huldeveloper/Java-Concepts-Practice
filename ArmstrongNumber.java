public class MyClass {
    static boolean isArmstrong(int n){
        int temp = 0, last = 0, digit=0, sum = 0;
        
        temp = n;
        while(temp > 0){
            temp /= 10;
            digit++;
        }
        temp = n;
        
        while(temp > 0){
            last = temp % 10;
            sum += Math.pow(last,digit);
            temp /= 10;
        }
        
        // check if number is armstrong
        if(n == sum){
            return true;
            
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args){
        int num = 200;
        for(int i = 0; i < num; i++){
            if(isArmstrong(i))
              System.out.println(i);
        }
    }
}
