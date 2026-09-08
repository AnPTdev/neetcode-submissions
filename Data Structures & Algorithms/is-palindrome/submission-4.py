class Solution:
    def isPalindrome(self, s: str) -> bool:
        # remove space
        s = s.replace(" ", "")
        s = "".join(char.lower() for char in s if char.isalnum())
        n = len(s)
        #
        for i in range(n // 2):
            left = s[i]
            right = s[n - i - 1]
            if left != right:
                return False
        return True
