from itertools import permutations
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        temp=permutations(nums)
        return list(temp)
        