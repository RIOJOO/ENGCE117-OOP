import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูล Car
        String carModel = sc.nextLine();
        double carRate = Double.parseDouble(sc.nextLine());

        // รับข้อมูล Motorcycle
        String motoModel = sc.nextLine();
        double motoRate = Double.parseDouble(sc.nextLine());

        // สร้าง Array แบบ Polymorphism
        RentalVehicle[] vehicles = new RentalVehicle[2];
        vehicles[0] = new Car(carModel, carRate);
        vehicles[1] = new Motorcycle(motoModel, motoRate);

        // วนลูปแสดงผล
        for (RentalVehicle v : vehicles) {
            System.out.println(v.calculateFee());
        }

        sc.close();
    }
}