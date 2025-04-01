class Solution {
    public int maxDepth(String s) {
        int maxdepth =0;
        int currdepth =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                currdepth++;
            }
            else if(s.charAt(i)==')'){
                currdepth--;
            }
            maxdepth = Math.max(maxdepth,currdepth);
        }
        return maxdepth;
    }
}









