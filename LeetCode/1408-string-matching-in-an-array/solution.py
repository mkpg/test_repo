class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        a = []

        for b in range(len(words)):
            for c in range(len(words)):
                if b != c and words[b] in words[c]:
                    a.append(words[b])
                    break

        return a