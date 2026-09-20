class Solution {
    public int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;

        int max = Integer.MIN_VALUE;

        while(i < j){

            int count = list.get(i) + list.get(j);

            if(count > max){
                max = count;
            }

            i++;
            j--;
        }

        return max;
    }
}