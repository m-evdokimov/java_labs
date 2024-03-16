package src.lab2.Task8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Животные: ");

        Dog dog = new Dog("Шарик", 2, "Овчарка", "Мясо");
        Cat cat = new Cat("Мурзик", 1, "Сфинкс", "Дорогой корм");
        Bird bird = new Bird("Кеша", 4, "Голубь", true);

        System.out.println("Собака");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Еда: " + dog.getFoodType());
        dog.makeSound();

        System.out.println("\nКот");
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Еда: " + cat.getFoodType());
        cat.makeSound();

        System.out.println("\nBird");
        System.out.println("Имя: " + bird.getName());
        System.out.println("Возраст: " + bird.getAge());
        System.out.println("Может летать: " + bird.canFly());
        bird.makeSound();


        Square square = new Square(5);
        Rhombus rhombus = new Rhombus(5, 10);

        System.out.println("\nКвадрат");
        System.out.println("Ширина: " + square.getW());
        System.out.println("Длина: " + square.getL());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println("Площадь: " + square.getArea());

        System.out.println("\nРомб");
        System.out.println("Ширина: " + rhombus.getW());
        System.out.println("Длина: " + rhombus.getL());
        System.out.println("Угол: " + rhombus.getAngle());
        System.out.println("Периметр: " + rhombus.getPerimeter());
        System.out.println("Площадь: " + rhombus.getArea());
    }
}