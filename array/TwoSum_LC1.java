class TwoSum_LC1 {
    //Varun Kumar
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(hm.containsKey(diff)){
                res[0]=hm.get(diff);
                res[1]=i;
                return res;
            }
            hm.put(nums[i],i);
        }
       
        return res;
    }
}
