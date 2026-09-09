class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        my_map1 = {}
        my_map2 = {}
        for char in s:
            num = my_map1.get(char, 0) + 1
            my_map1[char] = num
        for char in t:
            num = my_map2.get(char, 0) + 1
            my_map2[char] = num
        if my_map1 == my_map2:
            return True
        return False
