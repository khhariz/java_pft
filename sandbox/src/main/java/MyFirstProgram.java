public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Kris");

        double length = 7;
        System.out.println("Площадь равна " +  area(length));
    }


    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }




    public static double area(double l){
         return l*l;
}

}


