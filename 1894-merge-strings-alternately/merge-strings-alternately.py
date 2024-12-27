class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        w1 = len(word1)
        w2 = len(word2)
        c = min(w1,w2)
        l = []
        for i in range(c):
            l.append(word1[i])
            l.append(word2[i])
        if w1>w2:
            for j in range(c,w1):
                l.append(word1[j])
        else:
            for k in range(c,w2):
                l.append(word2[k])


        return "".join(l)