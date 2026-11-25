
class Solution {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){
            arr.add(curr);
            curr = curr.next;
        }

        int f = 0;
        int l = arr.size() - 1;

   
        while(f < l){

            arr.get(f).next = arr.get(l);
            f++;

            if(f == l) break;

            arr.get(l).next = arr.get(f);
            l--;
        }

        arr.get(f).next = null;
    }
}
