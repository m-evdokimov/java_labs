package src.lab2.Task6;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.f);
        Shape square = new Square(5.f);
        Shape triangle = new Triangle(3.f, 4.f, 5.f);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}
