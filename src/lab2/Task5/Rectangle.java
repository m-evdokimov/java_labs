package src.lab2.Task5;

public class Rectangle {
    private double h, w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public void setHeight(double h) {
        this.h = h;
    }
    public double getH() {
        return this.h;
    }

    public void setWidth(double w) {
        this.w = w;
    }
    public double getW() {
        return this.w;
    }

    public double getArea() {
        return this.h * this.w;
    }
    public double getPerimeter() {
        return 2 * (this.h + this.w);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.f, 5.f);

        System.out.println("Информация о прямоугольнике");
        System.out.println("Длина:" + r.getH());
        System.out.println("Ширина:" + r.getW());
        System.out.println("Площадь:" + r.getArea());
        System.out.println("Периметр:" + r.getPerimeter());
    }
}