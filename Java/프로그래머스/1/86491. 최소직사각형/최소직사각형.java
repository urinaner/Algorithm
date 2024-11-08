class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        
        for(int []size: sizes){
            int X = Math.max(size[0], size[1]);
            int Y = Math.min(size[0], size[1]);
            maxX = Math.max(maxX, X);
            maxY = Math.max(maxY, Y);
        }
        return maxX*maxY;
    }
}