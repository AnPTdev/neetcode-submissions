class MinStack:

    def __init__(self):
        self.minStack = []
        self.stack = []
        self.curMin = float('inf')
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        if val <= self.curMin:
            self.minStack.append(val)
            self.curMin = val

    def pop(self) -> None:
        val = self.stack.pop()
        if val == self.curMin:
            self.minStack.pop()
            self.curMin = self.minStack[-1] if self.minStack else float('inf')

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.curMin