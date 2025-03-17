import java.util.Arrays;
import java.util.Comparator;
public class Solution {
    public static int maximumMeetings(int[] start, int[] end) {
        int[][] activities = new int[start.length][2];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(o -> o[1]));
        int maxAct = 1;
        int lastEnd = activities[0][1];
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][0] > lastEnd) {
                maxAct++;
                lastEnd = activities[i][1];
            }
        }
        return maxAct;
    }
}
