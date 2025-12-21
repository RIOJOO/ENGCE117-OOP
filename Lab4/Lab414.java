import java.util.Scanner;
import java.util.Arrays;

class ScoreBoard {
    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = Arrays.copyOf(other.scores, other.scores.length);
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + (i < scores.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

public class Lab414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int[] originalScores = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int newValue = sc.nextInt();

        ScoreBoard sb1 = new ScoreBoard(name, originalScores);
        
        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = newValue;

        sb1.displayScores();
        sb2.displayScores();
        
        sc.close();
    }
}