class Solution {
    public void reverse(int start,int end,int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        Solution s = new Solution();
        s.reverse(0,n-1,nums);
        s.reverse(0,k-1,nums);
        s.reverse(k,n-1,nums);
        System.out.print(Arrays.toString(nums));
    }
}