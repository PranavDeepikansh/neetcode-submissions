class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
         ArrayList<Integer> list = new ArrayList<>();
      
        for(int val:nums){
             map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>(nums.length/3)){
                list.add(key);
                // return list;
            }
        }
        return list;




        
    }
}