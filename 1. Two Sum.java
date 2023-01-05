class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];
        Map<Integer,Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(nums[i])) {
                if (nums[i] + nums[i] == target) {
                    indices[0] = numToIndex.get(nums[i]);
                    indices[1] = i;
                    return indices;
                }
            }
            numToIndex.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (target - nums[i] != nums[i] && numToIndex.containsKey(target - nums[i])) {
                indices[0] = i;
                indices[1] = numToIndex .get(target - nums[i]);
                break;
            }
        }
        return indices;
    }
}