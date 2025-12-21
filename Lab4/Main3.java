import java.util.Scanner;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        this.red = checkRange(r);
        this.green = checkRange(g);
        this.blue = checkRange(b);
    }

    private int checkRange(int value) {
        if (value < 0) return 0;
        if (value > 255) return 255;
        return value;
    }

    public int getRed() { return red; }
    public int getGreen() { return green; }
    public int getBlue() { return blue; }

    public void displayRGB() {
        System.out.println("R:" + red + ", G:" + green + ", B:" + blue);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            Color myColor = new Color(r, g, b);
            myColor.displayRGB();
        }

        sc.close();
    }
}