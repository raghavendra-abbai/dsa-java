class Solution {

    public static boolean palindromeHelper(int i , int j , String s){

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false ; 
            }

            i++ ; 
            j-- ; 
        }
        return true ; 

    }

   
    public boolean validPalindrome(String s) {

        int i = 0 ; 
         int j = s.length()-1 ; 

         while(i<=j){
            
            if(s.charAt(i) != s.charAt(j)){

                return palindromeHelper(i+1 , j ,s) || palindromeHelper(i , j-1 , s);
            }
            
            i= i+1 ; 
            j= j-1 ; 

         }


    return true ; 
        
    }
}