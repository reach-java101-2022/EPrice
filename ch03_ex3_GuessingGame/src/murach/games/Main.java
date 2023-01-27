package murach.games;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();        
        
      // start my scanner
      Scanner sc = new Scanner(System.in);
      // asks the user for the upper limit
      System.out.print("Enter an upper limit: ");
      // reading the next line from the user
      String s = sc.nextLine();
      // convert the String into an int
      int upperLimit = Integer.parseInt(s);
      
      
        // Generate a random number between 0 and the upperLimit variable
        Random random = new Random();
        int number = random.nextInt(upperLimit - 1) + 1;
        
        System.out.println("number: " + number);  // remove this from final app
    }
}