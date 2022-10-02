//Best Time to Buy and Sell Stock II -> Leetcode Problem 122
import java.util.Scanner;

public class BuyAndSell {
    public static void main(String[] args){                         //main function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                       //taking inputs
        int arr[]= new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Profit obj = new Profit();                                      //creating object
        System.out.println(obj.maxProfit(arr, n));
    }
}
class Profit {
    public int maxProfit(int[] prices, int n){                  //function that have the logic
        int profit = 0;
        for(int i = 1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}
