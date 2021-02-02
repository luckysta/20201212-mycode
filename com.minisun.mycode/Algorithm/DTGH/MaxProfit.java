package Algorithm.DTGH;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,5,4,3,2,1};
        System.out.println(maxProfit(prices));
    }


    /**
     * 买卖股票的最佳时机
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if(price <minPrice){
                minPrice = price;
            }else if(price-minPrice > maxProfit ){
                maxProfit = price-minPrice;
            }
        }
        return maxProfit;
    }
}
