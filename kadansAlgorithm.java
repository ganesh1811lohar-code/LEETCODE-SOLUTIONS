class kadansAlgorithm {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0 ; i < nums.length; i++) {
            cs = cs + nums[i];
            ms = Math.max(cs,ms);
            if(cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] nums = {-2};

        kadansAlgorithm s1 = new kadansAlgorithm();
        System.out.println(s1.maxSubArray(nums));
    }
}