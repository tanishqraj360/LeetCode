import java.util.Collections;
import java.util.List;

class Solution {
    // Converts a time string "HH:MM" to minutes
    public int time_to_min(String t) {
        int h = Integer.parseInt(t.split(":")[0]);
        int m = Integer.parseInt(t.split(":")[1]);
        return 60 * h + m;
    }

    // Finds the minimum time difference between any two time points
    public int findMinDifference(List<String> timePoints) {
        // Sort the time points
        Collections.sort(timePoints);
        
        // Initialize result with a large value
        int res = (24 * 60 - time_to_min(timePoints.get(timePoints.size() - 1)) + time_to_min(timePoints.get(0)));


        
        // Compare the first and last time points for circular difference
        int minFirstLast = 24 * 60 - time_to_min(timePoints.get(timePoints.size() - 1)) + time_to_min(timePoints.get(0));
        res = Math.min(res, minFirstLast);
        
        // Loop through sorted time points and calculate differences
        for (int i = 1; i < timePoints.size(); i++) {
            int cur = time_to_min(timePoints.get(i));
            int prev = time_to_min(timePoints.get(i - 1));
            int diff = cur - prev;
            res = Math.min(res, diff);
            
            // If the minimum difference is 0, return immediately
            if (res == 0) {
                return 0;
            }
        }
        
        return res;
    }
}
