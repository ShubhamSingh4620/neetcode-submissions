class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)==len(t):
            a=''.join(sorted(s))
            b=''.join(sorted(t))
            if a==b:
                return True
            else:
                return False
        return False