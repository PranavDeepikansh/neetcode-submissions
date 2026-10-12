class Solution {
    public int[] productExceptSelf(int[] nums) {
        // ArrayList<Integer> a=new ArrayList<>();
        int right, left;
        right=left=1;
        int n=nums.length;
        int [] a=new int[n];
        for(int i=0;i<nums.length;i++){
            int c=left;
            a[i]=left;
             left*=nums[i];


        }
        for(int i=(nums.length-1);i>=0;i--){
            a[i]*=right;
            right*=nums[i];

        }
        return a;

        
    }
}  
