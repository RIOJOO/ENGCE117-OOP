import java.util.Scanner;

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inputLat = sc.nextDouble();
        double inputLon = sc.nextDouble();
        double newLatForLoc1 = sc.nextDouble();

        Location loc1 = new Location(inputLat, inputLon);

        Location loc2 = new Location(loc1);

        loc1.setLatitude(newLatForLoc1);

        loc1.displayInfo();
        loc2.displayInfo();

        sc.close();
    }
}