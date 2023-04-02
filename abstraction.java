abstract class FirstWord {
   abstract void say();
}

class Girl extends FirstWord {
   void say() {
   System.out.println("Hii mummy");
   }
}   
   class Boy extends FirstWord {
   void say() {
   System.out.println("Hello Papa");
   }
}

class Speak{

  public static void main(String[] args){
  FirstWord fw = new Girl();
  FirstWord fw1 = new Boy();
  fw.say();
  fw1.say();
  }

}
