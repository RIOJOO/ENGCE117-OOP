import java.util.Scanner;

class Animal502 {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal502 {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cat myCat = new Cat();

        String catName = sc.nextLine();
        int catAge = sc.nextInt();

        myCat.name = catName;
        myCat.age = catAge;

        myCat.displayInfo();
        myCat.makeSound();

        sc.close();
    }
}