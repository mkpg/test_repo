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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        temp = head;
        int[] ar = new int[c]; 
        for(int i=0;i<c;i++){
            ar[i] = temp.val;
            temp = temp.next;
        }
        int emp = 0 ;
        for(int i = left-1,j = right-1; j>=i;i++,j--){
            emp = ar[i];
            ar[i] = ar[j];
            ar[j] = emp;
        }
        temp = head;
        for(int i = 0 ; i <ar.length; i++){
            temp.val = ar[i];
            temp = temp.next;
        }
        return head;
    }
}