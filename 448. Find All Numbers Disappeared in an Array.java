class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        boolean[] isNumsExist = new boolean[nums.length];
        for (int num : nums)
            isNumsExist[num - 1] = true;
        for (int i = 0; i < isNumsExist.length; i++)
            if (!isNumsExist[i])
                missing.add(i + 1);
        return missing;
    }
}