
class Solution {
    public int removeElement(int[] nums, int val) {
        int pum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pum] = nums[i];
                pum++;
            }
        }
        return pum;
    }
}
