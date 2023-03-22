public class Aggregation {
   String city,state,country;
   Aggregation(String city,String state, String country){
       this.city = city;
       this.state = state;
       this.country = country;
   }
   static class Emp{
       int id;
       String name;
       Aggregation address;

       public Emp(int id, String name, Aggregation address){
           this.id = id;
           this.name = name;
           this.address = address;
       }
       void display(){
           System.out.println(id+" "+name);
           System.out.println(address.city+" "+address.state+" "+address.country);
       }

       public static void main(String[] args) {
           Aggregation aggregation = new Aggregation("goa","Mumbai","India");
           Emp e = new Emp(123,"rahul",aggregation);
           e.display();

       }
   }
}
