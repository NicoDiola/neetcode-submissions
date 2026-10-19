class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int answer = 0;

        while(l < r){
            int length = r - l;
            int height = Math.min(heights[r], heights[l]);
            answer = Math.max(answer, length * height);

            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return answer;
    }
}
