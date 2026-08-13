class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement= target-nums[i];
            int[] arr = new int[2];
        if (map.containsKey(complement)){
            arr[0]= map.get(complement);
            arr[1]= i;
            return arr;
        }
            map.put(nums[i], i);
        }
    return new int[]{};
}}
