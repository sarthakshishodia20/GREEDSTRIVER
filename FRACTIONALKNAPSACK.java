import java.util.*; 
import java.io.*;

// class Pair {
//     int weight;
//     int value;
//     Pair(int weight, int value) {
//         this.weight = weight;
//         this.value = value;
//     }
// }

public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        double totalVal = 0;
        for (int i = 0; i < n; i++) {
            if (w >= items[i].weight) {
                totalVal += items[i].value;
                w -= items[i].weight;
            } else {
                totalVal += ((double) items[i].value / items[i].weight) * w;
                break;  // No more weight can be taken
            }
        }
        return totalVal;
    }
}
