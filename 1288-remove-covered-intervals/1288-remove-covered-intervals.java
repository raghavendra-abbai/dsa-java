class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        int count = 0 ; 
    
     for(int i = 0 ; i<intervals.length ; i++){

        int c = intervals[i][0];
        int d = intervals[i][1] ;

        boolean contain = false ; 

        for(int j = 0 ; j< intervals.length ; j++){

            int a = intervals[j][0] ; 
            int b = intervals[j][1] ;

            if( i != j  && (a<=c && b>=d)){

                contain = true ; 
                break ;

            }
        }
           if(!contain) {
                count  = count +1 ; 
            }
     }

     return count  ;
        
    }
}