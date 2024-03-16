package src.lab2.Task4;

enum Sex {
    Male,
    Female
}

public class Person {
    private String name;
    private Sex sex;
    private int age;

    public Person(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public Sex getSex() {
        return this.sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person p = new Person("Макс", Sex.Male, 23);

        System.out.println("Данные о человеке:");
        System.out.println("Имя: " + p.getName());
        System.out.println("Пол: " + p.getSex());
        System.out.println("Возраст: " + p.getAge());

        System.out.println("\nСтарение...");
        p.setAge(p.getAge() + 1);

        System.out.println("Данные о человеке:");
        System.out.println("Имя: " + p.getName());
        System.out.println("Пол: " + p.getSex());
        System.out.println("Возраст: " + p.getAge());
    }
}