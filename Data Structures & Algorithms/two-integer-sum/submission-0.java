class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if(numMap.containsKey(diff))
                return new int[]{numMap.get(diff), i};
            
            numMap.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}