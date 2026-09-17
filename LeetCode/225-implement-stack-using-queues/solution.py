class Box:
    def __init__(self,data):
        self.data = data
        self.next = None

class MyStack:

    def __init__(self):
        self.head = None

    def push(self, x: int) -> None:
        z = Box(x)
        z.next = self.head
        self.head = z

    def pop(self) -> int:
        if self.head == None:
            return None
        
        v = self.head.data
        self.head = self.head.next
        return v

    def top(self) -> int:
        return self.head.data if self.head else None

    def empty(self) -> bool:
        if self.head:
            return False
        else:
            return True


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.head()
# param_4 = obj.empty()