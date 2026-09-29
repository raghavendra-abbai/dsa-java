class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = 0 ;

        int i = 0 ;
        int j = 0 ;

        HashSet set = new HashSet() ;

        while(j< s.length()){

  
           

           while(set.contains(s.charAt(j))){
            set.remove(s.charAt(i)) ;
            i++;
           }

           if(set.contains(s.charAt(j))){
            break ;
           }

           set.add(s.charAt(j)) ;
           length = Math.max(length , j-i+1);


                j= j+1 ;
        }

        return length;

    }
}