import java.util.*;

class Solution4sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int lp = j + 1;
                int rp = nums.length - 1;

                while (lp < rp) {

                    long sum = (long) nums[i]
                            + nums[j]
                            + nums[lp]
                            + nums[rp];

                    if (sum == target) {

                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[lp],
                                nums[rp]
                        ));

                        while (lp < rp && nums[lp] == nums[lp + 1]) {
                            lp++;
                        }

                        while (lp < rp && nums[rp] == nums[rp - 1]) {
                            rp--;
                        }

                        lp++;
                        rp--;

                    } else if (sum < target) {
                        lp++;
                    } else {
                        rp--;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        Solution4sum s1 = new Solution4sum();

        System.out.println(s1.fourSum(nums,0));
    }
}