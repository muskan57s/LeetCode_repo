class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        small = 0; 
        large = len(numbers)- 1
        sum= 0

        while small < large:
            sum = numbers[small] + numbers[large]
            if sum == target:
                return [small+1, large +1]
            elif sum < target:
                small += 1
            else:
                 large -= 1;      
        return(-1, -1)