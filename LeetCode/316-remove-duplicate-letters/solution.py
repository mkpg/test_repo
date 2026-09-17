class Solution(object):

    def removeDuplicateLetters(self, s):

        if not s:
            return ""

        for c in sorted(set(s)):

            pos = s.index(c)

            suffix = s[pos:]

            if set(suffix) == set(s):

                return c + self.removeDuplicateLetters(
                    suffix.replace(c, "")
                )