class TimeMap:

    def __init__(self):
        self.keyStore = collections.defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.keyStore[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.keyStore:
            return ""
        values = self.keyStore[key]
        left, right = 0, len(values) - 1
        res = ""
        while left <= right:
            mid = (left + right) // 2
            if values[mid][0] <= timestamp:
                res = values[mid][1]
                left = mid + 1
            else:
                right = mid - 1
        return res