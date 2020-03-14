class Subject14:
    def longerstCommonPrefix01(self, strs: 'List[str]') -> 'str':
        if len(strs) == 0 or '' in strs:
            return ''
        if len(set(strs)) == 1:
            