class Solution {

    public boolean solve(int a,int n){
        if(Math.pow(2,a)==n) return true;
        if(Math.pow(2,a)>n) return false;
        return solve(a+1,n);

    }

    public boolean isPowerOfTwo(int n) {
        int a = 0;
        return solve(a,n);
    }
}