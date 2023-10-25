import java.util.*;
public class SellandBuy
{
    public static int BuyandSell(int [] prices)
    {
        int Buy=Integer.MAX_VALUE;
        int MaxProfit=0;

        for (int i=0; i<prices.length; i++)
        {
            if (Buy < prices[i])
            {
                int profit=prices[i]-Buy;
                MaxProfit=Math.max(MaxProfit,profit);
            }
            else
            {
                Buy=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main (String args[])
    {
        int [] prices={7,1,5,3,6,4};
        int Output=BuyandSell(prices);
        System.out.println(Output);
    }
}
