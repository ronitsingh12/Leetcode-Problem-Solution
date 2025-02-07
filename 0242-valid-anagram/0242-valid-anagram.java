class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        String[] arr=s.split("");
        String[] arr1=t.split("");

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);
    }
}