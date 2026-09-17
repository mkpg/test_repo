// class Solution {
//     public int maxProfit(int[] prices) {
//         int temp = 0;
//         int pro = 0;
//         int id = 0 ;

//         for(int i = 0;i<prices.length-1;i++){
//             for(int j = i+1;j<prices.length;j++){
//                 if(prices[i]<prices[j] && (prices[j] - prices[i]) > pro){ temp = i;
//                 id = j;
//                 pro = prices[j]-prices[i];
//             }
//         }
//         }
//         return prices[id]-prices[temp];
//     }
// }

// class Solution {
//     public int maxProfit(int[] prices) {
//         int a = 0;
//         int b = prices.length - 1;
//         int c =0;
//         for (int i = 1;i < prices.length-1;i++) {
//             // a = prices[i];
//             if (prices[i] < prices[a]) {
//                 a = i;
//             }else if (prices[i] - prices[a] > c) {
//                 c = prices[i] - prices[a];
//                 b = i; 
//             }
//             }
//             // for( int j = prices.length - 1; j > a;j--){
//             // if (prices[j] > prices[b]) {
//             //     b = j;
//             // }}

//         //    c = prices[b]-prices[a];
//         //    if(c<0)return 0;
//         return c;
//         }
        
//     }


class Solution {
    public int maxProfit(int[] prices) {
        int a = 0;
        int b =0;
        int c =0;
        for (int i = 1;i < prices.length;i++) {
            if (prices[i] < prices[a]) {
                a = i;
            }else if (prices[i] - prices[a] > c) {
                c = prices[i] - prices[a];
                b = i; 
            }
            }
           
        return c;
        }
        
    }
