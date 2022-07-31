package ua.ithilel.java.circle;

public class TestCircle {

    public static void main(String[] arg) {
    //создаём объект класса Circle с именем с1 (используя 3-й конструктор)
        Circle c1 = new Circle(1.0, "green");
        System.out.println("Radius = " + c1.getRadius() + " Color - " + c1.getColor() + " Area= " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius = " + c2.getRadius() + " Color - " + c2.getColor() + " Area= " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Radius = " + c3.getRadius() + " Color - " + c3.getColor() + " Area= " + c3.getArea());
    }
}
