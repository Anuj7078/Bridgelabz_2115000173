class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Bhaoo Bhaoo");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Meow Meow");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Te Te Te");
    }
}
public class AnimalHeirachy {
    public static void main(String[] args) {
        Animal myDog = new Dog("Dharmpal", 12);
        Animal myCat = new Cat("Galaxy Destroyer",8);
        Animal myBird = new Bird("Meehu", 5);
        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}
