import java.util.Scanner;
/**
 * The example program for Nested Statemnts
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // switch case example
    // get the user choice between 1-5
    System.out.println("Please select a number between (1-5)");
    int choice = input.nextInt();


    // which candy to drop
    switch(choice){
      case 1:
       System.out.println("Here is your chocolate bar");
       break;
      case 2:
       System.out.println("Here are your skittles");
       break;
      case 3:
       System.out.println("Here are your M&Ms");
       break;
      case 4:
       System.out.println("Here are your Twizzlers");
       break;
      case 5:
       System.out.println("Here are your Pretzels");
       break; 
      default:
      System.out.println("Invalid choice"); 
    }
    
    
    
    // nested loop example
    // Ask user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    // Check to see if feather status 
    if(featherAnswer.equals("yes")){
      // Get me feather colour
      System.out.println("What colour are the feathers? (red/blue)");
      String featherColour = input.nextLine();

      // Deterimine what type of bird
      if(featherColour.equals("blue")){
        System.out.println("That is a blue jay");
      }else if(featherColour.equals("red")){
        System.out.println("That is a cardinal");
      }

    // If the user enerted no
    }else{

    }
    
  }
}
