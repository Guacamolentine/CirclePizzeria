package ua.ithilel.java.circle;

public class Circle {

    //переменные с уровнем доступа private
    private double radius;
    private String color;

    //конструкторы (перегружаемые)
    public Circle() { //1-й конструктор
        radius = 1.0;
        color = "green";
    }

    public Circle(double r) { //2-й конструктор
        radius = r;
        color = "green";
    }

    public Circle(double r, String c) { //3-й конструктор
        radius = r;
        color = c;
    }

    // методы с уровнем доступа public
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
