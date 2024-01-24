import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in)) {
      int value = scanner.nextInt();
      for(int i = 0;i<value;i++)
      {
        System.out.println("This is a loop");
      }
    }
    catch(Exception e)
    {
      System.out.println("Input de magi");
    } 
  }
}