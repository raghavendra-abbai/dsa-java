class MyCalendarTwo {

    TreeMap<Integer, Integer> m;

    public MyCalendarTwo() {
        m = new TreeMap<>();
    }

    public boolean book(int start, int end) {

        m.put(start, m.getOrDefault(start, 0) + 1);
        m.put(end, m.getOrDefault(end, 0) - 1);

        int count = 0;

        for(int i : m.values()) {

            count += i;

            if(count == 3) {

                m.put(start, m.get(start) - 1);
                m.put(end, m.get(end) + 1);

                return false;
            }
        }

        return true;
    }
}