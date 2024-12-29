class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s) 
        st = 0
        en = len(s) - 1
        while st < en:
            if s[st] in "aeiouAEIOU" and s[en] in "aeiouAEIOU":
                s[st], s[en] = s[en], s[st]
                st += 1
                en -= 1
            elif s[st] in "aeiouAEIOU":
                en -= 1
            else:
                st += 1
        s = ''.join(s)  
        return s



        