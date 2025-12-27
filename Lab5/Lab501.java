import java.util.Scanner;

class Animal{

    protected String name;
    protected int age;

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}

public class Lab501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog myDog = new Dog();

        String dogName = sc.nextLine();
        int dogAge = sc.nextInt();

        myDog.name = dogName;
        myDog.age = dogAge;

        myDog.makeSound();

        myDog.displayInfo();

        sc.close();
    }
}
