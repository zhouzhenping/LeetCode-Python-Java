class Subject14(object):
    def longerstCommonPrefix01(self, strs: 'List[str]') -> 'str':
        if len(strs) == 0 or '' in strs:
            return ''
        if len(set(strs)) == 1:
            return strs[0]
        maxlen = min([len(e) for e in strs])
        check = 1
        i = 0
        while (check != 0 & i < maxlen):
            sub = [e[:i] for e in strs]
            if len(set(sub)) == 1:
                i += 1
            else:
                check = 0
        return strs[0][:i-1]