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
    public ListNode swapNodes(ListNode head, int k) {

        int len = 0 ;
       

        ListNode curr = head   ;

        while(curr != null){    
            len = len+1 ; 
            curr = curr.next ; 
        }

        ListNode n1 = head ; 

        for(int i = 0 ; i< k-1 ; i++){
            n1= n1.next ; 
        }

        ListNode n2 = head ; 

        for(int i =  0 ; i< len-k ; i++){
            n2 = n2.next ;
        }

        int temp = n1.val ;
        n1.val = n2.val ;
        n2.val = temp ; 

        return head ; 

     




      
    }
}