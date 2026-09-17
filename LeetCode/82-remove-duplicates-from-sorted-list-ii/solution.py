# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        d = ListNode(0)
        d.next = head
        prev = d
        temp = head
        while temp:
            if temp.next and temp.val == temp.next.val:
                val = temp.val
                while temp and temp.val == val:
                    temp = temp.next
                prev.next = temp
            else:
                prev = temp
                temp = temp.next
        return d.next
