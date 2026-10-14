class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings , Comparator.comparingInt(a->a[0])) ; 

       int maxend = meetings[0][1]  ;

       int gap = 0 ;

       for(int i = 1  ; i< meetings.length ; i++){

        if(meetings[i][0] > maxend){
            gap = gap + meetings[i][0] - maxend -1 ;
        }

        maxend = Math.max(maxend , meetings[i][1]) ; 
       }

       gap = gap + meetings[0][0] -1; 
       gap = gap + days - maxend ; 

       return gap ; 
        
    }
}