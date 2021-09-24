import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    int userNum;
    

    System.out.println("Welcome to the guessing game!\nPlease enter any positive whole number:");
    userNum = s.nextInt();
    
    int randomNum;
    randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");
    
    playGame(randomNum, userNum);
  }
    static void playGame(int randomNum, int userNum) {
      
      Scanner s2 = new Scanner(System.in);
      int userGuess;
      int numTries=0;
      
      System.out.println("Please guess a number between 0 and " + userNum);
      userGuess= s2.nextInt();
      
      while (userGuess!=randomNum) {
        
        numTries++;

        if (userGuess>randomNum) {
          System.out.println("Guess lower!");
          System.out.println("Enter your new guess:");
          userGuess = s2.nextInt();
        }
        else if (userGuess<randomNum) {
          System.out.println("Guess higher!");
          System.out.println("Enter your new guess:");
          userGuess = s2.nextInt();
        }

      }
      System.out.println("Great, you win! It took you " + numTries +" tries.");
    }
  }
