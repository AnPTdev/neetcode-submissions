class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        q = deque()
        for n in tokens:
            if n == "+":
                num2 = q.pop()
                num1 = q.pop()
                total = int(num1)+int(num2)
                q.append(total)
            elif n == "-":
                num2 = q.pop()
                num1 = q.pop()
                total = int(num1)-int(num2)
                q.append(total)
            elif n == "*":
                num2 = q.pop()
                num1 = q.pop()
                total = int(num1)*int(num2)
                q.append(total)
            elif n == "/":
                num2 = q.pop()
                num1 = q.pop()
                total = int(int(num1)/int(num2))
                q.append(total)
            else:
                q.append(n)
        return int(q.pop())