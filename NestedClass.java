/*

          ------------   JAVA INNER CLASSES   ------------


    class OuterClass {
        int num1 = 40;

        class InnerClass {
            int num2 = 40;
        }
    }

    public class NestedClass {
        public static void main(String[] args) {
            OuterClass outerClass = new OuterClass();
            OuterClass.InnerClass innerClass = outerClass.new InnerClass();
            System.out.println(innerClass.num2 + outerClass.num1);
        }
    }

 */


    /*
             ------------  STATIC INNER CLASS ------------

    class OuterClass {
        int num1 = 10;

        // STATIC INNERCLASS DOES NOT HAVE ACCESS TO ACCESS THE MEMBERS OF OUTERCLASS
        static class InnerClass {
            byte num2 = 2;
        }
    }
    public class NestedClass {
        public static void main(String[] args) {
            OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
            System.out.println(innerClass.num2);
        }
    }

     */

     /*
         -----------  ACCESS OUTER CLASS FROM INNER CLASS  ---------------


    class OuterClass {
        int x = 55555555;

        class InnerClass {
            public int myInnerMethod(){
                return x;
            }
        }
    }

    public class NestedClass {
        public static void main(String[] args) {
            OuterClass outerClass = new OuterClass();
            OuterClass.InnerClass innerClass = outerClass.new InnerClass();
            System.out.println(innerClass.myInnerMethod());
        }
    }


      */