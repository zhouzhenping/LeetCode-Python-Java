class Subject09(object):
    def isPalindrome01(self, x: int) -> bool:
        str_x = str(x)
        return str_x == str_x[::-1]
    
    def isPalindrome02(self, x: int) -> bool:
        x = str(x)
        if len(x) % 2 == 0:
            if x[:len(x) // 2] == x[len(x) // 2:][::-1]:
                return True
            else:
                return False
        elif x[len(x) // 2 + 1:] == x[:len(x) // 2][::-1]:
            return True
        else:
            return False
    
    def isPalindrome03(self, x: int) -> bool:
        if x < 0:
            return False
        strValue = list(str(x))
        left, right = 0, len(strValue) -1
        while left <= right:
            if strValue[left] != strValue[right]:
                return False
            left += 1
            right -= 1
        return True
    
    def isPalindrome04(self, x: int) -> bool:
        if x < 0:
            return False
        elif x == 0:
            return True
        elif x % 10 == 0:
            return False
        else:
            def rev(x):
                reverse = 0
                temp = x
                while temp != 0:
                    reverse = reverse * 10 + temp % 10
                    temp = temp // 10
                return reverse
            return x == rev(x)
    
    def isPalindrome05(self, x: 'int') -> bool:
        string_x = str(x)
        if string_x[0] == '-':
            return False
        else:
            reversed_string_x = string_x[::-1]
        reversed_x = int(reversed_string_x)

        return x == reversed_x

subject09 = Subject09()
print(subject09.isPalindrome01(12138))
print(subject09.isPalindrome02(12138))
print(subject09.isPalindrome03(12138))
print(subject09.isPalindrome04(12138))
print(subject09.isPalindrome05(12138))

            

