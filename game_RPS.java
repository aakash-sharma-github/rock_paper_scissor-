import java.util.Scanner;
import java.util.Random;

public class game_RPS {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        String[] rps = {"r", "p", "s"};
        Random random = new Random();
        String yourChoice;
        String comp = rps[random.nextInt(rps.length)];

        while (true){
            System.out.println("r for Rock, p for paper, s for Scissor");
            System.out.println("Enter your choice:");
            yourChoice = game.nextLine();
            if (yourChoice.equals("r") || yourChoice.equals("p") || yourChoice.equals("s")) {
                break;
            }
            System.out.println(yourChoice+" is invalid input.");
        }
        System.out.println("Computer played: "+comp);

            if (yourChoice.equals(comp)) {
                System.out.println("Match Draw");
            } else if (yourChoice.equals("r")) {
                if (comp.equals("p")) {
                    System.out.println("You loose!!!");
                    System.out.println("Rock cover Paper.");
                    System.out.println("Try again...");
                }
                else if (comp.equals("s")) {
                    System.out.println("You win!!!");
                    System.out.println("Rock Ruin scissor.");
                }
            } else if (yourChoice.equals("p")) {
                if (comp.equals("s")) {
                    System.out.println("You loose!!!");
                    System.out.println("Scissor cut Paper.");
                    System.out.println("Try again...");
                }
                else if (comp.equals("r")) {
                    System.out.println("You win!!!");
                    System.out.println("Paper cover Rock.");
                }
            } else if (yourChoice.equals("s")) {
                if (comp.equals("r")) {
                    System.out.println("You loose!!!");
                    System.out.println("Scissor Ruined by Rock");
                    System.out.println("Try again...");
                }
                else if (comp.equals("p")) {
                    System.out.println("You win!!!");
                    System.out.println("Scissor cut Paper");
                }
            }
    }
}
