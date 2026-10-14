class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int stone: stones){
            pq.add(stone);
        }

        while(pq.size() != 0){

            if(pq.size() == 1){
                return pq.poll();
            }
            int y = pq.poll();
            int x = pq.poll();
            int sum = y - x;

            System.out.println(sum);
            if(sum > 0){
                pq.add(sum);
            }
        }

        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0;
    }
}
