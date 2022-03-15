class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        answer = [None for _ in nums]
        l, r = 0, len(nums) - 1
        
        for i in range(len(nums)-1, -1, -1):
            if abs(nums[l]) > abs(nums[r]):
                answer[i] = nums[l] ** 2
                l += 1
            else:
                answer[i] = nums[r] ** 2
                r -= 1
                
        return answer