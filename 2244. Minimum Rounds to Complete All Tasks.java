class Solution {
    public int minimumRounds(int[] tasks) {
        if (tasks.length == 1)
            return -1;
        int rounds = 0;
        Arrays.sort(tasks);
        int count = 1;
        for (int i = 0; i < tasks.length - 1; i++) {
            if (tasks[i+1] != tasks[i]) {
                if (count == 1)
                    return -1;
                else
                    rounds += (count + 2) / 3;
                    count = 1;
            } else
                count++;
        }
        if (count == 1)
            return -1;
        else
            rounds += (count + 2) / 3;
        return rounds;
    }
}