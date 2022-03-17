# 시간 복잡도 O(N)
# 공간 복잡도 O(1)

class Solution:
    def reverse(self, nums, i, j):
        li, ri = i, j # 왼쪽, 오른쪽 index
        
        while li < ri:
            tmp = nums[li]
            nums[li] = nums[ri]
            nums[ri] = tmp
            
            li += 1
            ri -= 1
        
        
    def rotate(self, nums: List[int], k: int) -> None:
        k %= len(nums) # k가 101이면 1번만 돌리면 되는데, %로 안나누면 101번 돌아야함
    
        self.reverse(nums, 0, len(nums) - k - 1) # 첫번째 파트
        self.reverse(nums, len(nums) - k, len(nums) - 1) # 두번째 파트
        self.reverse(nums, 0, len(nums) - 1) # 전체