public class SChar{
 public static void main(String[] args){
   String str = new String("my name is rahul");
   char[] ch = new char[20];
try{
str.getChars(10,16,ch,0);
System.out.println(ch);
}
catch(Exception e){
System.out.println(e);

}
}
}