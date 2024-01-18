package Array_Scaler;

public class Buy_Sell_Stock {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 4};
        System.out.println(BuySellStock(arr));
    }
    public static int BuySellStock(int arr[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(buyPrice<arr[i])
            {
                int profit = arr[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else
            {
                buyPrice=arr[i];
            }
        }
        return maxprofit;
    }
}
