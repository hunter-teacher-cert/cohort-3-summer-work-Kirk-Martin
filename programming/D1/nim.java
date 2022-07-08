  import java.io.*;
import java.util.*.io
 
  public class Nim
  {
    public static void main (string[] args)
    {
      int stones=12;
      int stones taken;
      Scanner in= new Scanner(System.in);
      //loop until game ends
      while (stones >0){
        //prompt user for taking turns
        System.prompt.println(Please enter a number from 1-3");
        stonesTaken=in.nextInt();//taking from the user

      //calculate the  number of stones
        stones =stones-stonesTaken;
        System.out.println((there are  " +stones+ 
 "  left ");
        //stones"))

        if(stones<=0)

        {
            System.out.println("You win !");
        }

        //machine participates
        System.out.println("Computers Turn ");
        stonesTaken=(int)(Math.randon()*3)+1;
        //Math.random()(maxmin+1+min
        stones=stones-stonesTaken;
        System.out.println("The computer took " + stonesTaken)
        //calculate the number of stones remaing
          //print
          System.out.println("There are  "  + stones + " left)
          //check for the win
          if (stones <=0)

        {

          System.out.println("Computer wind !");

        }
        }
                            
                            //)
          )
        
      
      }
    }