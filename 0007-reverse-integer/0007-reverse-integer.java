// class Solution {
//     public int reverse(int x) {
//         int org = x;
        
//         if(x<0){
//             x *= -1;
//         }
//         String num = String.valueOf(x);
//         int len = num.length();
//         int d = (int) Math.pow(10,len-1);
//         int ans = 0;
//         int rem;
//         while(x>0){
//             rem = x % 10;
//             ans += rem*d;
//             d /= 10;
//             x /= 10; 
//         }
//         if(ans>=Integer.MAX_VALUE || ans<=Integer.MIN_VALUE){
//             return 0;
//         }

//         if(org<x){
//             return -ans;
//         }
//         return ans; 
//     }
// }
class Solution {
    public int reverse(int x) {
        int ans = 0;
        
        while (x != 0) {
            int rem = x % 10;
            
            // Check for overflow before updating ans
            if (ans > Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && rem>5)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans==Integer.MAX_VALUE/10 && rem<-8)) return 0;  
            ans = ans * 10 + rem;
            x /= 10;
        }
        
        return ans;
    }
}
