
/**
 * SimplediceCom test code。
 * @組員:10627147楊于姍
 */
public class SimplediceComTester
{
    public static void main(String[] args)
    {
        SimplediceCom dices = new SimplediceCom();
        int[] number = {1, 1, 1};
        dices.setDiceCells(number);
        String result = dices.checkYourself();
        String Sorttest = "Sort failed";
        if (number[0]<=number[1] && number[1]<=number[2])
        {
            Sorttest = "Sort passed";
        }
        System.out.println(Sorttest);   
        
        String testResult = "checkYourself failed";
        if (result.equals("three of a kind"))
        {
            testResult = "checkYourself passed";
        }
        System.out.println(testResult);
    }

}
