// Wrong approach:
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         int i = 0, j = 1;

//         while (j < nums.length) {
//             if (nums[i] == nums[j])
//                 return true;

//             i++;
//             j++;
//         }

//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num: nums) {
            if(numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }

        return false;
    }
}