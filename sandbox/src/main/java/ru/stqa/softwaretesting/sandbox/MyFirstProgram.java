package ru.stqa.softwaretesting.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("ww");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point z = new Point(11,2, 33,22);
        System.out.println("=======================================================================================");
        System.out.println("Расстояние между точкой " + " x" + z.x1 + " y" + z.y1 + " и точкой " + "x2" + z.x2 + "y2 " + z.y2 + " = " + z.area());


    }

    public static void hello(String somebady) {
        System.out.println("Hello, " + somebady + "!");
    }







}

