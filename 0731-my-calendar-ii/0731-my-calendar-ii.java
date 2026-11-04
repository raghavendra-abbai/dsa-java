class MyCalendarTwo {

    List<int[]> bookings;
    List<int[]> overLapBookings;

    public MyCalendarTwo() {
        bookings = new ArrayList<int[]>();
        overLapBookings = new ArrayList<int[]>();
    }

    public boolean book(int startTime, int endTime) {

        for(int[] b : overLapBookings) {
            if(startTime < b[1] && endTime > b[0]) {
                return false;
            }
        }

        for(int[] b : bookings) {
            int start = Math.max(startTime, b[0]);
            int end = Math.min(endTime, b[1]);

            if(start < end) {
                overLapBookings.add(new int[]{start, end});
            }
        }

        bookings.add(new int[]{startTime, endTime});

        return true;
    }
}