package AllCodes.src.Recursion;

import java.util.*;

public class TreasureMaximization {
    static class Task {
        char id;
        int effort;
        int reward;
        Task(char id, int effort, int reward) {
            this.id = id;
            this.effort = effort;
            this.reward = reward;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smax = sc.nextInt();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            String tid = sc.next();
            int effort = sc.nextInt();
            int reward = sc.nextInt();
            tasks[i] = new Task(tid.charAt(0), effort, reward);
        }

        // dp[i][j] = max reward using first i tasks and stamina j
        int[][] dp = new int[n + 1][smax + 1];
        boolean[][] take = new boolean[n + 1][smax + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= smax; j++) {
                // Not take current
                dp[i][j] = dp[i - 1][j];
                // Take current if possible
                if (j >= tasks[i - 1].effort) {
                    int newReward = dp[i - 1][j - tasks[i - 1].effort] + tasks[i - 1].reward;
                    if (newReward > dp[i][j]) {
                        dp[i][j] = newReward;
                        take[i][j] = true;
                    }
                }
            }
        }

        // Find selected tasks
        List<Character> selected = new ArrayList<>();
        int totalEffort = 0, totalReward = dp[n][smax];
        int j = smax;
        for (int i = n; i > 0; i--) {
            if (take[i][j]) {
                selected.add(tasks[i - 1].id);
                j -= tasks[i - 1].effort;
                totalEffort += tasks[i - 1].effort;
            }
        }

        if (selected.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.reverse(selected);
            for (char c : selected) System.out.print(c + " ");
            System.out.println();
            System.out.println(totalEffort + " " + totalReward);
        }
    }
}
