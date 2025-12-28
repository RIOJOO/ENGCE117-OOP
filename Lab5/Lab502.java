import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.printf("Name: %s, Age: %d%n", this.name, this.age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab502 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            String name = sc.nextLine();
            int age = sc.nextInt();

            Cat myCat = new Cat();
            myCat.name = name;
            myCat.age = age;

            renderOutput(myCat);
        }
    }

    private static void renderOutput(Cat cat) {
        cat.displayInfo();
        cat.makeSound();
    }
}