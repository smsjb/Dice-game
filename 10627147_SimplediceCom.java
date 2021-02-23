
/**
 * 設定骰子並判斷和回傳骰子關係種類,若沒關係則回傳骰子總和。
 * SimplediceCom real code
 * @組員:10627147楊于姍

 */

public class SimplediceCom {
    int[] diceCells;
    
    public void setDiceCells(int[] dices)
    {
        diceCells = dices;
    }
    
    public  void Sort() {


    for (int i=diceCells.length-1; i>=0; i--)
    {
        for (int j=0, tmp=0; j<i; j++)
        {
            if (diceCells[j]>diceCells[i])//換（"小於"是由大到小）
            {
                tmp=diceCells[j];
                diceCells[j]=diceCells[i];
                diceCells[i]=tmp;
            }

        }
    }

    

    }
    
    public String checkYourself() {
        
        String result = "nothing";
        Sort();
    int same = 0;
    boolean IsStraight = true;
    for( int i = 1; i < diceCells.length; i++)
    {
        if(diceCells[i-1] == diceCells[i])
        {
            same++;
        }
        
        if(diceCells[i-1] != diceCells[i]-1)
        {
            IsStraight = false;
        }    
    }

    if ( same==2 && !IsStraight)
    {
        result = "three of a kind";
    }
    else if ( same==0 && IsStraight)
    {
         result ="straight";
    }
    else if ( same==1 && !IsStraight)
    {
         result ="pair";
    }
    else 
    {
        int sum = diceCells[0] + diceCells[1] + diceCells[2];
         result = Integer.toString(sum);
    }
    
    return result;
    }
}
