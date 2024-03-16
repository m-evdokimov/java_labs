package src.lab2.Task6;

interface Shape {
  double getArea();
  double getPerimeter();
}

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}

class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(this.a, 2);
    }
    @Override
    public double getPerimeter() {
        return 4 * this.a;
    }
}

class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (this.a + this.b + this.c) * .5f;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }
    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
