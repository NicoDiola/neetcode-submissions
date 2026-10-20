class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row = 0; row < 9; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char temp = board[row][i];
                if(temp == '.'){
                    continue;
                }
                if(seen.contains(temp)){
                    return false;
                }
                seen.add(temp);
            }
        }

        for(int col = 0; col < 9; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char temp = board[i][col];
                if(temp == '.'){
                    continue;
                }
                if(seen.contains(temp)){
                    return false;
                }
                seen.add(temp);
            }
        }

        for(int i = 0; i < 9; i++){
            HashSet<Character> seen = new HashSet<>();
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    int r = (i / 3) * 3 + row;
                    int c = (i % 3) * 3 + col;

                    char temp = board[r][c];
                    if(temp == '.'){
                        continue;
                    }
                    if(seen.contains(temp)){
                        return false;
                    }
                    seen.add(temp);
                }
            }
        }

        return true;
    }
}
