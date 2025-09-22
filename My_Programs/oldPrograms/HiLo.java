import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);    
        String Menu = """

        Welcome to HiLo!
        
        Please select your difficulty level:
        
        1. Easy (1-10)
        2. Medium (1-100)
        3. Hard (1-1000)
        """;

    System.out.println(Menu);
    boolean repeat = true;
    int guesses = 0;

        do {    
        int userChoice = s.nextInt();         
        switch (userChoice) {
            case 1:
                guesses = playGame(10);
                repeat = false;
                break;
            case 2:
                guesses = playGame(100);
                repeat = false;
                break;
            case 3:
                guesses = playGame(1000);
                repeat = false;
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("Please enter a valid input:");
                break;
            }
        } while (repeat);
        
        System.out.println("And it took you " + guesses + " tries to guess the right one!");
        System.out.println("");
    }
    // 
    public static int playGame(int maxNumber) {
        Scanner s = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * maxNumber) + 1;
        int userGuess;
        int numGuess = 0;

        do { 
            System.out.println("");
            System.out.println("Guess a number between 1 and " + (maxNumber) + ":");
            System.out.println("");
            
            userGuess = s.nextInt();
            numGuess = numGuess + 1;
            giveResponse(randomNumber, userGuess);

        } while (userGuess != randomNumber);
    
        return numGuess;
    }
    //
    public static void giveResponse(int answer, int guess) {
        if (answer > guess) {
            System.out.println("Nope! Too Low!");    
        } else if (answer < guess) {
            System.out.println("Negative! Too High!");
        } else if (answer == guess) {
            System.out.println("");
            System.out.println("Awesome done! The correct number was " + answer + "!");  
        }
    }
    // 
}