package JAVA_CODE.recursion;

public class tiling {
    public static int tilingProblem(int n) {
        //base case
        if(n==0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    //Remove duplicate from String 
    public static void removeDuplicates(String str , int idx , StringBuilder newStr,boolean map[]){
        if(idx ==str.length()) {
            System.out.println(newStr);
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    //Friends pairing problem
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1 = friendsPairing(n-1);

        // //Pair
        // int fnm2 = friendsPairing(n-2);
        // int pairways = (n-1) * fnm2;

        // //total ways
        // int totWays = fnm1 +pairways;
        // return totWays;

        return friendsPairing(n-1) +(n-1)*friendsPairing(n-2);
    }

    //Binary String problem
    public static void printBinStrings(int n,int lastPlace , String str){
        //Base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace == 0){
        //     //sit 0 on chair n
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1,1, str.append("0"));
        // }
        // else{
        //     printBinStrings(n-1, 0, str.append("0"));
        // }

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1,1, str+"1");
        }
    }
    public static void main(String[] args) {
      //  System.out.println(tilingProblem(4));


      //  String str="appnnacollege";
      //  removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        
     // System.out.println(friendsPairing(3));

     printBinStrings(3, 0, new String(""));
    }
}
