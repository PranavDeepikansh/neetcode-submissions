
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        int p = 1;
        while (set.contains(p)) {
            p++;
        }
        return p;
    }
}

