package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Kris");


        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " +s.l + " равна " +  s.area());


        Rectangle r = new Rectangle(4,6);
        //r.a = 4;
        //r.b = 6;
        //double c = 8;
        //double d = 9;
        System.out.println("Площадь прямоугольника со сторонами "  + r.a + " и " + r.b + " равна " +  r.area());
    }


    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }




   /* public static double area(Rectangle n){
        return n.a * n.b;
    }*/
}


