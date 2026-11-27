
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

            int len =  0;

            ListNode curr = head ; 
            while(curr != null){
                len = len+1 ; 
                curr =  curr.next ; 
            }
            
            int toDistribute = len/k ; 
            int Remaining =  len%k ; 

            ListNode[] res = new ListNode[k] ; 

            curr = head ; 

            for(int i = 0 ; i < k ; i++ ){

               int count = toDistribute ; 

                if(Remaining > 0 ){
                    count = count +1 ; 
                    Remaining =  Remaining -1 ; 
                }

                ListNode temp = curr ; 
                ListNode prev = null  ;
               int counter = 0 ; 

                while(counter < count ){
                     prev = curr ; 
                    curr = curr.next ; 

                    counter = counter+1 ; 
                }
                if(prev != null){
                    prev.next = null ; 
                }
                
                res[i] = temp ;
            }
            return res  ;
    }
}
