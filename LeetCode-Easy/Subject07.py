import math

class Solution07(object):
    def reverse01(self, x):
        """
        :type x: int
        :rtype: int
        """
        x = str(x)
        upper_bound = (1 << 31) - 1
        neg_flag = 1
        if x[0] == '-':
            neg_flag = -1
            x =x[1:]
        if x[0] == '+':
            x = x[1:]
        temp = int(x[::-1]) # 字典反转即可，只要考虑符号，Java则要选择数学方法反转数字
        if temp >= upper_bound:
            temp = 0
        return neg_flag * temp
    
    def reverse02(self, x): # 好像不正确呀！
        ret = 0
        mul = 1
        sign = x / abs(x) if x is not 0 else 0
        log = int(math.log(abs(x)) / math.log(10)) if x is not 0 else 0 # 判断反转后所在位数，从0 计数，所以123的话log为2
        for mul in [10 ** d for d in range(log + 1)]:
            ret += (10 ** log) * (sign * ((abs(x) / mul) % 10)) # 10 乘幂 位数 乘以 
            log -= 1
        return ret if ret <= 2 ** 31 - 1 and ret >= -(2 ** 31) else 0

solution07 = Solution07()
print(solution07.reverse02(123))