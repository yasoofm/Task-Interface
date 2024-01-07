package Animals;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.eat();
        dog.eat();
        dog.sleep();
        cat.sleep();
        cat.makeSound();
        dog.makeSound();
    }
}
