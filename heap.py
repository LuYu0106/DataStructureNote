
# sometimes we need an customized heap
# Assuming the key is a functiom, we can add a label for the element
q = []
for a, b in classes:
    heapq.heappush(q, (label, a, b))
# Leetcode 5703 1792. Maximum Average Pass Ratio

class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        #classes.sort(key = lambda x: - (x[0] + 1.0) / (x[1] + 1.0) + x[0] * 1.0 / x[1])
        q = []
        for p, t in classes:
            heapq.heappush(q, [p/t - (p+1)/(t+1), p, t])
        while extraStudents > 0:
            label, p, t = heapq.heappop(q)

            heapq.heappush(q, [(p + 1)/(t + 1) - (p + 2)/ (t + 2), p + 1, t + 1])
            extraStudents -= 1

        res = 0.0
       # print(q)
        for _, p, t in q:
            res +=  p/t
        return res / len(classes)



