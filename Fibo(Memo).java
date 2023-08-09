
/*
 Remeber 3 steps : to convert a recurssive solution to memoization
 1) declare a array to store the answer of problems 
 2) store the ans
 3) check if answer is already stored 
 */


import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int [n+1];
        Arrays.fill(dp,-1);
        int ans = fibo(n,dp);
        
        System.out.println(ans);
    }

    public static int  fibo(int n,int dp[]){
        if(n <=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
    }
}
