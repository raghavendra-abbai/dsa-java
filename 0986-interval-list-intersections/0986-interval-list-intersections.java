import java.util.ArrayList;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int s1 = firstList[i][0];
            int e1 = firstList[i][1];

            int s2 = secondList[j][0];
            int e2 = secondList[j][1];

            if (Math.max(s1, s2) <= Math.min(e1, e2)) {
                list.add(new int[] {
                    Math.max(s1, s2),
                    Math.min(e1, e2)
                });
            }

            if (e1 < e2) {
                i++;
            } else {
                j++;
            }
        }

        int[][] ans = new int[list.size()][2];

        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }
}