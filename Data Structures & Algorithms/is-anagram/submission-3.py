class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_map = {}
        t_map = {}
        for ch in s:
            s_map[ch] = s_map.get(ch, 0) + 1
        for ch in t:
            t_map[ch] = t_map.get(ch, 0) + 1
        return s_map == t_map
