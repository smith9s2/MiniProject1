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
      
    }
  }
