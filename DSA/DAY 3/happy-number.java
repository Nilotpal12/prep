class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n!=1){
            n = sum(n);
            if(set.contains(n)) return false;
            set.add(n);
        }

        return true;
    }

    public int sum(int n){
        int sum = 0;

        while(n>0){
            int p = n%10;
            n = n/10;
            sum += p*p;
        }

        return sum;
    }
}