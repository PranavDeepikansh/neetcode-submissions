class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
       String p = "";
        for(int i=n-1;i>=0;i--){
            p+=s[i];
        }
       for (int i = 0; i < n; i++) {
            s[i] = p.charAt(i);
        }

    }
}