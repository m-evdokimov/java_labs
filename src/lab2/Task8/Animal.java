package src.lab2.Task8;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void makeSound() {
        System.out.println("**Звуки животных**");
    }
}


class Dog extends Animal {
    private String breed;
    private String foodType;

    public Dog(String name, int age, String breed, String foodType) {
        super(name, age);
        this.breed = breed;
        this.foodType = foodType;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class Cat extends Animal {
    private String breed;
    private String foodType;

    public Cat(String name, int age, String breed, String foodType) {
        super(name, age);
        this.breed = breed;
        this.foodType = foodType;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Bird extends Animal {
    private String species;
    private boolean canFly;

    public Bird(String name, int age, String species, boolean canFly) {
        super(name, age);
        this.species = species;
        this.canFly = canFly;
    }

    public boolean canFly() {
        return this.canFly;
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик!");
    }
}
