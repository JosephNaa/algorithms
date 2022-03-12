class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        if len(nums) == 1:
            return nums[0]
        
        cur = nums[0]
        max_num = cur
        
        for i in range(1, len(nums)):
            cur = max(nums[i], cur + nums[i])
            max_num = max(max_num, cur)
            
        return max_num