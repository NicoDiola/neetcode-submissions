class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;

        int res = 0;
        while(l < r){
            int length = r - l;
            int height = Math.min(heights[l], heights[r]);
            int sum = length * height;
            res = Math.max(res, sum);

            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
