class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int size = nums.length;
        for(int num: nums){
           set.add(num); 
        }
        
        for(int i = 0; i <= size; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}
