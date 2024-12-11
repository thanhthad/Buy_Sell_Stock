public class Buy_and_Sell_Stock {
//    static public int maxProfit(int[] prices) {
//        int max = 0;
//        int length = prices.length;
//        for(int i = 0 ; i < length -1 ; i++){
//            for(int j = i + 1 ; j < length ; j++){
//                if(prices[j] - prices[i] > 0 && (max < prices[j] - prices[i])){
//                    max = prices[j] - prices[i];
//                }
//            }
//        }
//        return max;
//    }

    static public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profix = 0;
        int count =0;
        for(int i = 0 ; i < prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            count = prices[i] - min;
            if(profix < count){
                profix = count;
            }
        }
        return profix;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
