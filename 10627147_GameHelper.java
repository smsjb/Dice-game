/**
 * GameHelper real code
 * @組員:10627147楊于姍
 */

import java.io.*;
import java.util.*;

public class GameHelper { 

  public String getUserInput(String prompt) { //得到user input
     String inputLine = null;
     System.out.print(prompt + "  ");
     try {
       BufferedReader is = new BufferedReader(
     new InputStreamReader(System.in));
       inputLine = is.readLine();
       if (inputLine.length() == 0 )  return null; 
     } catch (IOException e) {
       System.out.println("IOException: " + e);
     }
     return inputLine.toLowerCase();
  }


  public boolean LeaveOrNot() { //check leave or not
      
      String option = getUserInput("play again?(y/n)");
      boolean result = false;
      
     
          if ( option.equals("n") )  //leave
          {
              result = true;
          }
          else if (option.equals("y") ) //play again
          { 

              result = false;
          }
          else //error massage
          {
                    System.out.println("error command");
                    result =LeaveOrNot();
          }
      return result ;
  }
  
  
  public int[] CreateDice() {
      //create and print 3 dices with 3 random number between 1~6

      int[] result = new int[3];
  
                for (int i = 0; i < result.length; i++)
                { 
                    int randomNum = (int) (Math.random() * 7);
                    if(randomNum==0)
                    {
                        randomNum++;
                    }
                    result[i] = randomNum;
                    System.out.println( "dice"+(i+1)+": "+ randomNum );
                }
          
      return result ;
  }
}


