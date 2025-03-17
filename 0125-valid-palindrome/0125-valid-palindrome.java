class Solution {
    public boolean isPalindrome(String s) {
         char arr[] = s.toCharArray();
    String ts ="";
    String ans = "";

    for (char c : arr) 
    {
      if((c>=65 && c <= 90) || (c >=97 && c <= 122) || (Character.getNumericValue(c)>=0 && Character.getNumericValue(c)<=9)){
        ts += (""+c).toLowerCase();
      }
    }
    int c=0;
    for(int i=ts.length()-1;i>=0;i--){
      ans += ts.charAt(i);
      c++;
    }    
    if(ans.equals(ts)){
      return true;
    }
    else{
      return false;

    }
    }
}