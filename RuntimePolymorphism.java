class Shape {
    void draw(){
        System.out.println("Draw a Shape");
    }
}
class Rectangle extends Shape { 
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Circle extends Shape {
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Triangle extends Shape {
    void draw(){
        System.out.println("Drawing a triangle");
    }
}
class TestPolymorphism {
    public static void main(String[] args){
    Shape s;
    s = new Rectangle();
    s.draw();
    s = new Circle();
    s.draw();
    s = new Triangle();
    s.draw();
  }
}
