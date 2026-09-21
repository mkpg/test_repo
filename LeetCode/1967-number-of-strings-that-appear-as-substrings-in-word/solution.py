class Solution:
    def numOfStrings(self, a: List[str], b: str) -> int:
        cn = 0 
        for i in a:
            if i in b:
                cn+=1
        return cn