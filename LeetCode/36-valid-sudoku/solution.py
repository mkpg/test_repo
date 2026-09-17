class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        def row_chk(i,j):
            for l in range(len(board)):
                if l!=i:
                    if board[l][j] == board[i][j]:
                        return False
                
            return True
        def col_chk(i,j):
                for l in range(len(board)):
                    if l!=j:
                        if board[i][l] == board[i][j]:
                            return False
                return True
        
        def box_chk(i,j):
            st = (i//3)*3
            ed = (j//3)*3

            for k in range(st,st+3):
                for l in range(ed,ed+3):
                    if k==i and l==j:
                        continue
                    if board[k][l] == board[i][j]:
                        return False
            return True 


        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j] == '.':
                    continue
                if not row_chk(i,j) or not col_chk(i,j) or not box_chk(i,j):
                    return False
        return True