
class Solution {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }

        Stack<ListNode> st = new Stack<>();

        ListNode curr = head;

        while(curr != null){
            st.push(curr);
            curr = curr.next;
        }

        ListNode f = head;
        int n = st.size();

        for(int i = 0; i < n / 2; i++){

            ListNode last = st.pop();

            ListNode temp = f.next;

            f.next = last;
            last.next = temp;

            f = temp;
        }

        f.next = null;
    }
}
