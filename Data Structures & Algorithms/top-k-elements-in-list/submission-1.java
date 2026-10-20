class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] elements = new int[n];
        int[] freq = new int[n];

        int size = 0;
        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            elements[size] = nums[i];
            freq[size] = j - i;
            size++;

            i = j;
        }
        for (int a = 0; a < size; a++) {
            for (int b = a + 1; b < size; b++) {
                if (freq[b] > freq[a]) {
                    int temp = freq[a];
                    freq[a] = freq[b];
                    freq[b] = temp;

                    temp = elements[a];
                    elements[a] = elements[b];
                    elements[b] = temp;
                }
            }
        }

        int[] result = new int[k];

        for (int a = 0; a < k; a++) {
            result[a] = elements[a];
        }

        return result;
    }
}
