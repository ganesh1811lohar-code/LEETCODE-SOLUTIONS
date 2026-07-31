public class Solution{
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length; i++ ) {
            int x = nums[i] ;
            int y = target - x ;

            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[j] == y) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Solution s1 =new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = s1.twoSum(nums,target);

        for(int i =0 ; i < result.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
}