
import java.util.*;

class SummaryRanges {

    List<Integer> sr;

    public SummaryRanges() {
        sr = new ArrayList<>();
    }

    public void addNum(int value) {

        if (!sr.contains(value)) {
            sr.add(value);
        }
    }

    public int[][] getIntervals() {

        List<int[]> list = new ArrayList<>();

        if (sr.isEmpty()) {
            return new int[0][];
        }

        Collections.sort(sr);

        int start = sr.get(0);
        int end = sr.get(0);

        for (int i = 0; i < sr.size() - 1; i++) {

            if (sr.get(i + 1) == sr.get(i) + 1) {

                end = sr.get(i + 1);

            } else {

                list.add(new int[]{start, end});

                start = sr.get(i + 1);
                end = sr.get(i + 1);
            }
        }
        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }
}
