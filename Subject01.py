'''
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
'''
class Solution01:
    def twoSum01(self, nums: 'List[int]', target: 'int') -> 'List[int]':
        dict = {}
        for i, num in enumerate(nums): # enumerate() 函数用于将一个可遍历的数据对象（如列表、元组或字符串）组合成为一个索引序列，
        # 同时列出数据和数据下表，一般用在for循环中。i 和 num, 默认前面一个是索引，后面一个是对象的内容
            #print('before enmumerate: %d %d %d' %(i, num, dict[num]))
            dict[num] = i # 键值对，num是键，i是值，赋予给num键

        for i, num in enumerate(nums):
            if target - num in dict and i != dict[target - num]: # 是判断键（key)在不在dict里面,且不等于自身
                return [i, dict [target - num]]
    
    def twoSum02(self, nums, target):
        '''
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        '''
        record = dict()
        for i in range(len(nums)):
            if nums[i] in record:
                return [record[nums[i]], i]
            record[target - nums[i]] = i
        return [-1, -1]

    def twoSum03(self, nums: 'List[int]', target: int) -> 'List[int]':
        d = {}
        for i in range(len(nums)):
            t = target - nums[i]
            if t in d.keys():
                return([d[t], i])
            d[nums[i]] = i,
    
    

    def main(self):
        print ('main method')
    
if __name__ == "__main__":
        pass

nums = [2, 7, 11, 15]
target = 9
solution01 = Solution01()
#print(solution01.twoSum01(nums, target))
#print(solution01.twoSum02(nums, target))
print(solution01.twoSum03(nums, target))
