import math
class SolutionTest(object):
    def reverse(self, x):
        ret = 0
        mul = 1
        sign = x/abs(x) if x is not 0 else 0
        log = int(math.log(abs(x))/math.log(10)) if x is not 0 else 0
        #maxmul = 10**log if x is not 0 else 0
        for mul in [10**d for d in range(log + 1)]:
            ret += (10**log)*(sign*((abs(x)/mul)%10))
            log -= 1        
        return ret if ret<=2**31-1 and ret >= -(2**31) else 0
        """
        :type x: int
        :rtype: int
        """
solutionTest = SolutionTest()
print(solutionTest.reverse(123))