class Solution {

   public static ListNode revList(ListNode head){

        ListNode curr = null ;

        while(head != null){

            ListNode temp = head.next ;

            head.next = curr ;
            curr = head ;
            head = temp; 

        }
        return curr ;





    }
    public int pairSum(ListNode head) {

        int max = Integer.MIN_VALUE ;

        ListNode slow = head ;
        ListNode fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }


       ListNode p1 = revList(slow) ;

       ListNode p2 = head;

       while(p1 != null && p2 != null){

        int count = p1.val + p2.val ;

        if(count > max){
            max = count  ;
        }

        p1 = p1.next ;
        p2 = p2.next ;

        
       }

       return max ;


    }
}