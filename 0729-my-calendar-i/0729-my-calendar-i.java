 

class MyCalendar{

    Map<Integer,Integer> map ; 

  
    public MyCalendar() {

        map = new TreeMap<Integer,Integer>() ; 

       

    }

    public boolean book(int start, int end) {

        map.put(start , map.getOrDefault(start , 0)+1) ;
        map.put(end , map.getOrDefault(end , 0) -1) ;



        int bookings = 0 ; 

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            bookings = bookings + entry.getValue() ; 

            if(bookings > 1) {
             
             map.put(start,map.getOrDefault(start , 0 ) -1) ;
             map.put(end ,map.getOrDefault(end , 0 ) +1) ;

             return false ;
            }
        }

        return true ; 


    }
}

