import java.util.*;
class ThreeSumProblem {
    public List<List<Integer>> sum(int[] nums , int target) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<nums.length-2;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int x = nums[i];

            //target -> x + lp + rp , target - x = lp + rp , value = target - x , target = lp + rp

            int lp = i+1;
            int rp = nums.length-1;

            int value = target - x;

            while(lp < rp) {
                if(nums[lp]+nums[rp] == value) {
                    ans.add(Arrays.asList(x, nums[lp], nums[rp]));

                    while(lp < rp && nums[lp] == nums[lp + 1]) {
                        lp++;
                    }
                    while(lp < rp && nums[rp] == nums[rp - 1]) {
                        rp--;
                    }
                    lp++;
                    rp--;
                } else if(nums[lp]+nums[rp] < value) {
                    lp++;
                } else {
                    rp--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,-1,0,1,2};
        ThreeSumProblem s1 =new ThreeSumProblem();
        System.out.println(s1.sum(nums, 0));
    }
}