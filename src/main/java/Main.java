import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(101);
        int min = 0;
        int max = 100;
        int answer;
        System.out.print("Guess number: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Only digits possible");
            System.out.print("Guess number: ");
            scanner = new Scanner(System.in);
        }
        answer = scanner.nextInt();

        while  (true){
            while (answer < 0 || answer > 100) {
                System.out.println("Number should be: 0 - 100");
                System.out.print("Guess number: ");
                scanner = new Scanner(System.in);
                while (!scanner.hasNextInt()){
                    System.out.println("Only digits possible");
                    System.out.print("Guess number: ");
                    scanner = new Scanner(System.in);
                }
                answer = scanner.nextInt();
            }
            if (answer < numberToGuess) {
                System.out.printf("Secret number is more, than %d try a number [%d, %d] \n", answer, answer, max);
                min = answer;
                System.out.print("Guess number: ");
                scanner = new Scanner(System.in);
                while (!scanner.hasNextInt()){
                    System.out.println("Only digits possible");
                    System.out.print("Guess number: ");
                    scanner = new Scanner(System.in);
                }
                answer = scanner.nextInt();
            }
            if (answer > numberToGuess) {
                System.out.printf("Secret number less, than %d try a number [%d, %d] \n", answer, min, answer);
                max = answer;
                System.out.print("Guess number: ");
                scanner = new Scanner(System.in);
                answer = scanner.nextInt();
            }
            if (answer==numberToGuess){
                System.out.println("Correct! You guess the number: " + answer);
                break;
            }

        }
    }
}
