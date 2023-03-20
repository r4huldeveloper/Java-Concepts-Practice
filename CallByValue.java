 class CallByValue {
     static int x = 100;

     // HERE WE ARE TAKING A METHOD WITH NO PARAMETERS IN IT
     void change() {
        x  += 100;
    }

    // HERE WE ARE TAKING A PARAMETERIZED METHOD RETURN NOTHING
     void operation(int op) {
        this.x += op ;
    }

    public static void main(String[] args) {
        CallByValue create = new CallByValue();
        // HERE WE ARE CALLING THE OPERATION METHOD
        create.operation(5);
        System.out.println(x);

        // HERE WE ARE CALLING THE CHANGE METHOD
        System.out.println("Before change the x is : " +  x);
         create.change();

        System.out.println("after change the x is :" + x);

    }
}
