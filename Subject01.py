'''
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
'''
class Solution01:
    def twosum01(self, nums: 'List[int]', target: 'int') -> 'List[int]':
        dict = {}
        for i, num in enumerate(nums): # enumerate() 函数用于将一个可遍历的数据对象（如列表、元组或字符串）组合成为一个索引序列，
        # 同时列出数据和数据下表，一般用在for循环中。i 和 num, 默认前面一个是索引，后面一个是对象的内容
            dict[num] = i # 键值对，num是键，i是值，赋予给num键

        for i, num in enumerate(nums):
            if target - num in dict and i != dict[target - num]: # 是判断键（key)在不在dict里面
                return [i, dict [target - num]]

    def main(self):
        print ('main method')
    
if __name__ == "__main__":
        pass

nums = [2, 7, 11, 15]
target = 9
solution01 = Solution01()
print(nums)
print(target)
result = solution01.twosum01(nums, target)
result02 = solution01.main() 
print('start')
print(result)
#print(Solution01.twosum01(nums, target))
#twosum(nums, target)

