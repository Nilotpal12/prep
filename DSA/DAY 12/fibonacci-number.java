class Solution {
    public int fib(int n) {

        int first = 0, second = 1;

        if(n==0) return 0;
        if(n==1) return 1;

        for(int i=2;i<=n;i++){
            int temp = first+second;
            first = second;
            second = temp;
        }

        return second;
    }
}