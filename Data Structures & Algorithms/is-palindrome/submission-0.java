class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       char[] arr = s.toCharArray();
       int n=arr.length;
       String p = "";
        for(int i=n-1;i>=0;i--){
            p+=arr[i];
        }
         return s.equals(p);

        
    }
}
