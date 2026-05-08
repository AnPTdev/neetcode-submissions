class Solution:
    def calPoints(self, operations: List[str]) -> int:
        points = []
        ans = 0
        for o in operations:
            if o == "+":
                summ = points[-1] + points[-2]
                points.append(summ)
                ans = ans + summ
            elif o == "C":
                last = points.pop()
                ans = ans - last
            elif o == "D":
                mul = points[-1] * 2
                points.append(mul)
                ans = ans + mul
            else:
                val = int(o)
                points.append(val)
                ans = ans + val
        return ans