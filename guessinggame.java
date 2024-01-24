import java.util.Random;
import java.util.Scanner;

public class guessinggame {
  public static void main(String[] args)
  {
      //generating random number
      Random random = new Random();

      int randomnumber;

      randomnumber = random.nextInt(20)+1;

      //System.out.println(randomnumber); 

      int guessindex = 5;

      Scanner scanner = new Scanner(System.in);

      while (guessindex>=0) 
      {
        guessindex--;

        System.out.println("Guess a number between 1 and 20 and remember it is your "+ guessindex +"th guess");

        try  
        {
          int guessnumber = scanner.nextInt();

          if(guessnumber<1 && guessnumber>20)
          {
            throw new ArithmeticException("You must give a value between 1 and 20");
            
          }
          if(guessnumber == randomnumber)
          {
          
          System.out.println("You are a lucky Winner!!");
          }
        else
        {
          System.out.println("You can guess again but this is your "+guessindex+ "th guess");
          int diff = guessnumber - randomnumber;
          if(diff>0)
          {
            System.out.println("Hint:Guess a lower number!");
          }
          else
          {
            System.out.println("Hint:Guess a higher number!");
          }
        }
      }  
      catch (Exception e) 
      {
        System.out.println("Give an integer input between 1 and 20");
      }
    }
    System.out.println("The game has ended!!");
    
  }
}
