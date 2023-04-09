public class ArmstrongNumber {

   public static void main (String[] args)
   {
        int num = 1634;
        int digit = 0;
        int temp = num;
        int sum=0;

        while(temp > 0){
            temp /= 10;
            digit++;
        }
     
        temp = num;
        while(temp > 0){
            int last = temp%10;
            sum += (int)(Math.pow(last, digit));
            temp = temp/10;
        }
     
        if(num == sum)
        {
            System.out.println("True");
        }
     
        else
        { 
            System.out.println("False");
        }
    }  
}
