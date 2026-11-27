class Solution {

   public static ListNode revList(ListNode head){


  ListNode curr = null ;

  while(head != null){
    ListNode temp = head.next ; 
    head.next = curr ; 
    curr = head ;
    head= temp ;
  }
return curr ; 

    }
    public int pairSum(ListNode head) {

        int max = Integer.MIN_VALUE ; 

        ListNode slow = head ; 
        ListNode fast = head ; 

        while(fast != null &&  fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next  ;
        }

        ListNode n1 = revList(slow) ; 
        ListNode n2 = head ; 

        while(n1 != null && n2 != null){
            int count = n1.val + n2.val ; 

            if(count > max){
              max = count ; 
            }
            n1= n1.next ; 
            n2 = n2.next ;
        }

         return max; 
    }
}