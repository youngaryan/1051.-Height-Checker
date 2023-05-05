import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int [] sorted = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int result = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != heights[i])
                result ++;
        }
        //throw new RuntimeException(Arrays.toString(sorted)+heights[1]);
        return result;
    }
}
