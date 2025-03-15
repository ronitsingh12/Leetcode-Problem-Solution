// class Solution {
//     public int majorityElement(int[] nums) {
//         int count=1;
//         int maxcount=1;
//         int maxelement=nums[0];
//         for(int i=0;i<nums.length-1;i++){
//             count=1;
//             for(int j=1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count > maxcount){
//                 maxelement = nums[i];
//                 maxcount = count;
//             }
            
//         }
//         return maxelement;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}