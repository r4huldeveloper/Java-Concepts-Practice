public class classLoader{

public static void main(String[] args){

       Class x = classLoader.class;
       System.out.println(x.getClassLoader());

        System.out.println(String.class.getClassLoader());
}
}