/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


     public ListNode reverseList(ListNode head) {

        ListNode curr = null;

        while(head != null){

            ListNode temp = head.next ;
            head.next = curr ;
            curr = head ;
            head = temp;
        }

        return curr;

        
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head ;

        while(fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
         

         ListNode p1 = reverseList(slow) ;
          ListNode p2 = head ;
        
        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false ;
            }

            p1 = p1.next ;
            p2 = p2.next ;
        }

        return true ;
      
        
    }
}