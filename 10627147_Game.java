
/**
 * 遊戲。
 * Game real code
 * @組員:10627147楊于姍

 */

public class Game {
    public static void main(String[] args)
    {
        
        System.out.println( "Game Start");
        SimplediceCom theDiceCom = new SimplediceCom();
        GameHelper helper = new GameHelper();
        int[] dices = helper.CreateDice();
        theDiceCom.setDiceCells(dices);
        
   
        System.out.println( theDiceCom.checkYourself());
        
        
        boolean leave = helper.LeaveOrNot();
        
       
        
        if (!leave) 
        {
       
            main(args);
        }
        
        
        
    }
}
