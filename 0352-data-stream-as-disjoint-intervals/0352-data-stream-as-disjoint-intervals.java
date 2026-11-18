class SummaryRanges {

   TreeSet<Integer> map ; 


    public SummaryRanges() {

        map = new TreeSet<>() ; 
     
    }

    public void addNum(int value) {

        map.add(value) ;

       
    }

    public int[][] getIntervals() {

      if(map.size() == 0){
        return new int [][]{} ; 
      }

      Integer left = null;
      Integer right = null ;

      List<int[]> res = new ArrayList<>() ; 

      for(Integer val : map){

        if(right == null && left == null){
            right = val ; 
            left = val ;
        }

        else if(val == right+1){
            right = val ;
        }

        else{
            res.add(new int[]{
                left , right
            }) ; 

            left = val ;
            right = val ;
        }
      } 

      res.add(new int []{
        left , right
      }) ; 

      int [][]ans = new int[res.size()][2] ;

      for(int i = 0 ; i<res.size() ; i=i+1){
        ans[i] = res.get(i) ;
      } 

      return ans ;

       
    }
}
