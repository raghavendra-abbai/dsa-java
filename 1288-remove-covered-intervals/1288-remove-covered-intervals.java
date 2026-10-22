class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0] == b[0] ? Integer.compare(b[1],a[1]) : Integer.compare(a[0],b[0]));
        int maxEnd = intervals[0][1], count = 1;

        for (int i = 1; i < intervals.length; i++) {
            
            if (intervals[i][1] > maxEnd) {
                count++;
                maxEnd = intervals[i][1];
            }
        }
        return count;
    }
}