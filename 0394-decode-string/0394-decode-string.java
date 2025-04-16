class Solution {
    public String decodeString(String s) {
       int currN = 0; 
       String currS = "";
       Stack<String> st = new Stack<>(); 
       Stack<Integer> st2 = new Stack<>();
        int prevN = 0;
        String prevS = "";
       for(char c:s.toCharArray()){
        if(Character.isDigit(c)){
            currN = (currN *10) + (c-'0');
        }
        else if(c=='['){
            st.push(currS);
            st2.push(currN);
            currN=0;
            currS = "";
        }
        else if(c==']'){
            prevS = st.pop();
            prevN = st2.pop();
            currS = prevS + currS.repeat(prevN);
        }
        else{
            currS +=c;
        }
       }
       return currS;
    }
}