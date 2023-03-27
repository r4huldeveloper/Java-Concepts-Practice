class Operation {
    static int sub(int a , int b){
        return a - b;
    }
    static double sub(double a , double b){
        return a - b;
    }
    static int add(int a , int b){
        return a + b;
    }
    static int multiply(int a , int b){
        return a * b;
    }
    public static void main(String... args){
        System.out.println(Operation.sub(12,2));
        System.out.println(Operation.sub(35.0,25.0));
        System.out.println(Operation.add(29,9));
        System.out.println(Operation.multiply(29,9));
        
    }
}
