class Box:
    def __init__(self,data):
        self.data = data
        self.next = None

class MyQueue:

    def __init__(self):
        self.head = None
        self.tail = None

    def push(self, x: int) -> None:
        z = Box(x)
        if self.head is None:
            self.head = z
            self.tail = z
        
        else:
            self.tail.next = z
            self.tail = z

    def pop(self) -> int:
        if self.head is None:
            return None
        
        if self.head == self.tail:
            v = self.head.data
            self.head = None
            self.tail = None
            return v

        v = self.head.data
        self.head = self.head.next
        return v

        # t = self.head
        # while t.next != self.tail:
        #     t = t.next

        # v = self.tail.data
        # t.next = None
        # self.tail = t
        # return v

    def peek(self) -> int:
        return self.head.data if self.head else None

    def empty(self) -> bool:
        return self.head is None
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()