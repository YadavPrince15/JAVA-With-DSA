package JAVA_CODE.GreedyAlgorithm;
import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10,20,50,100,500,1000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoin=0;
        int amount =674;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <=amount){
                    countOfCoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total minimum coin used = "+countOfCoin);

        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
