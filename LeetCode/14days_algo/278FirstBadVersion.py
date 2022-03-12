# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        left, right = 0, n
        
        if n == 1: return 1
        
        while left <= right:
            mid = (left + right) // 2
            if not isBadVersion(mid):
                left = mid + 1
            elif isBadVersion(mid) and isBadVersion(mid-1):
                right = mid - 1
            elif isBadVersion(mid) and not isBadVersion(mid-1):
                return mid
            
        return mid