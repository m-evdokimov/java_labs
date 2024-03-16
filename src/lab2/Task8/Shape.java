package src.lab2.Task8;

abstract class Parallelogram {
    protected double w, l;

    public Parallelogram(double w, double l) {
        this.w = w;
        this.l = l;
    }

    public double getW() {
        return this.w;
    }
    public double getL() {
        return this.l;
    }

    public abstract double getArea();
    public double getPerimeter() {
        return 2 * (this.w + this.l);
    }
}

class Square extends Parallelogram {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(this.w, 2);
    }
}

class Rhombus extends Parallelogram {
    private double angle;

    public Rhombus(double side, double angle) {
        super(side, side);
        this.angle = angle;
    }

    public double getAngle() {
        return this.angle;
    }

    @Override
    public double getArea() {
        return Math.pow(this.w, 2) * Math.sin(this.angle * Math.PI / 180);
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(double w, double l) {
        super(w, l);
    }

    @Override
    public double getArea() {
        return this.w * this.l;
    }
}
