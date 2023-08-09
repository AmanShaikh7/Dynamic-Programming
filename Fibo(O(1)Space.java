import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }

    public static int  fibo(int n){
        int prev2 = 0;
        int prev = 1;
        int curr = 0;
        for(int i=2;i<=n;i++){
            curr = prev+prev2;
            prev2=prev;
            prev = curr;
        }
        return prev;
    }

}

