class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for char in s:
            if char == "[" or char == "(" or char == "{":
                stack.append(char)
            else:
                if not stack:
                    return False
                poppedElement = stack[-1]
                if poppedElement == "(" and char == ")":
                    stack.pop()
                elif poppedElement == "[" and char == "]":
                    stack.pop()
                elif poppedElement == "{" and char == "}":
                    stack.pop()
                else:
                    return False
        if stack:
            return False
        return True
