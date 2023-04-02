abstract class FirstWord {
   abstract void say();
   abstract int getRateOfInterest();
}

class Girl extends FirstWord {
   void say() {
   System.out.println("Hii mummy");
   }
   
   // Now we are going to override the interestrate method;
   
   int getRateOfInterest(){
     return 9;
   }
}   
   class Boy extends FirstWord {
   void say() {
   System.out.println("Hello Papa");
   }
   
  // Now we are going to override the interestrate method;

   int getRateOfInterest(){
     return 12;
   }
}

class Speak{

  public static void main(String[] args){
  FirstWord fw = new Girl();
  FirstWord fw1 = new Boy();
  
  fw.say();
    System.out.println("The interest for you is: "+fw.getRateOfInterest()+"%");
  fw1.say();
    System.out.println("The interest for you is: "+fw1.getRateOfInterest()+"%");

  }

}
