class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        int i = 0;
        while (i < costs.length) {
            if (costs[i] <= coins) {
                coins -= costs[i];
                i++;
            } else 
                return i;
        }
        return i;
    }
}