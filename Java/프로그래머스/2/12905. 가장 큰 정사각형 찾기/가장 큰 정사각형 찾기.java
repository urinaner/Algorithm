import java.util.*;

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 1234;
        int maxSize = Integer.MIN_VALUE;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    if(1<=i && i<board.length && 1<=j && j<board[0].length){
                        board[i][j] = Math.min(board[i-1][j-1],Math.min(board[i-1][j],board[i][j-1])) + 1;
                    }
                    maxSize = Math.max(board[i][j], maxSize);
                }
                    
            }
        }
        return maxSize * maxSize;
    }
    
}