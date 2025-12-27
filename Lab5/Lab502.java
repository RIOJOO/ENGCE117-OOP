import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
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
        Scanner sc = new Scanner(System.in);

        Cat myCat = new Cat();

        String nameInput = sc.nextLine();
        int ageInput = sc.nextInt();

        myCat.name = nameInput;
        myCat.age = ageInput;

        myCat.displayInfo();

        myCat.makeSound();

        sc.close();
    }
}