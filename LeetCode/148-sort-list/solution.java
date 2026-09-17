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
    public ListNode sortList(ListNode head) {
        ListNode temp  = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        temp=head;
        int[] a1 = new int[c];
        for(int i=0;i<c;i++){
            a1[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(a1);
        temp=head;
        for(int i=0;i<c;i++){
             temp.val = a1[i];
            temp = temp.next;
        }

		
        return head;
    }
}