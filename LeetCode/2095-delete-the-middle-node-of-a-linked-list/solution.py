# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def counter(self,head):
        t = head
        c = 0
        while t != None:
            t = t.next
            c+=1

        return c
    
    def deleteMiddle(self, head):
        n = self.counter(head)

        if n == 1:
            return None

        mid = n // 2

        temp = head

        for _ in range(mid - 1):
            temp = temp.next

        temp.next = temp.next.next

        return head
    
    # def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # a = self.counter(head)
        # if a%2==0:
        #    return self.ev(head)
        # else:
        #     return self.od(head)
