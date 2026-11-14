class MyCalendarThree {

    Map<Integer,Integer> map ; 

   
    public MyCalendarThree() {

       map = new TreeMap<>() ;
        
    }
    
    public int book(int start, int end) {

       int count = 0 ; 

       map.put(start , map.getOrDefault(start , 0)+ 1) ;
       map.put(end , map.getOrDefault(end , 0) -1) ; 


        int bookings = 0 ; 

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            bookings = bookings + entry.getValue() ; 

           count = Math.max(bookings , count) ; 
          
        }

        return count ; 
           
        
    }
}
