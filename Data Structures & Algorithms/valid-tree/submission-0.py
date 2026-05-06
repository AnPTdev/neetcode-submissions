class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if not n:
            return True
        
        adj={i: [] for i in range(n)}
        for src, dst in edges:
            adj[src].append(dst)
            adj[dst].append(src)
        
        visit = set()

        def dfs(cur, prev):
            if cur in visit:
                return False
            visit.add(cur)
            for nxt in adj[cur]:
                if nxt == prev:
                    continue
                if not dfs(nxt,cur):
                    return False
            return True

        return dfs(0,-1) and len(visit) == n