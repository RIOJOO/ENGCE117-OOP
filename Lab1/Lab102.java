package Lab1;

public class Lab102 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        double area = width * height;

        System.out.println(area);
        
        sc.close();
    }
}