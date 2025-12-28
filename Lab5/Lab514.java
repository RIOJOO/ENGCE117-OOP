import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String trackingId, double baseFee) {
        super(trackingId, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String trackingId, double baseFee, double insuranceFee) {
        super(trackingId, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return baseFee + insuranceFee;
    }
}

public class Lab514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sId = sc.nextLine();
        double sFee = Double.parseDouble(sc.nextLine());

        String pId = sc.nextLine();
        double pFee = Double.parseDouble(sc.nextLine());
        double pInsurance = Double.parseDouble(sc.nextLine());

        Shipping[] shipments = new Shipping[2];
        shipments[0] = new StandardShipping(sId, sFee);
        shipments[1] = new PremiumShipping(pId, pFee, pInsurance);

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}