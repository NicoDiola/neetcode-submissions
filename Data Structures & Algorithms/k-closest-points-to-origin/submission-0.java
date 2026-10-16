class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        int[][] res = new int[k][2];

        for(int row = 0; row < points.length; row++){
            int[] temp = new int[2];
            int sum = points[row][0] * points[row][0] + points[row][1] * points[row][1];
            pq.add(new int[]{sum, points[row][0], points[row][1]});
        }

        for(int i = 0; i < k; i++){
            int[] point = pq.poll();
            res[i] = new int[]{point[1], point[2]};
        }

        return res;
    }
}
