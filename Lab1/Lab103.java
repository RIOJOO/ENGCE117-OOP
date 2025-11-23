import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int myNum = sc.nextInt();

        int check = (myNum / 2) * 2;

        if (check == myNum) {
            System.out.println("Even");
        } else {

            System.out.println("Odd");
        }
        
        sc.close();
    }
}