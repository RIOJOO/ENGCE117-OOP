import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice; //
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05; //
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice + (basePrice * premiumRate); //
    }
}

public class Lab512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bName = sc.nextLine();
        double bPrice = Double.parseDouble(sc.nextLine());

        String pName = sc.nextLine();
        double pPrice = Double.parseDouble(sc.nextLine());
        double pRate = Double.parseDouble(sc.nextLine());

        Service[] services = new Service[2];
        services[0] = new BasicService(bName, bPrice);
        services[1] = new PremiumService(pName, pPrice, pRate);

        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }
        
        sc.close();
    }
}