class RemoveDuplicateInSortedArray {

    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length + 1];

        for (int num : nums) {
            freq[num]++;
            if (freq[num] > 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        RemoveDuplicateInSortedArray s1 = new RemoveDuplicateInSortedArray();
        int output = s1.findDuplicate(nums);

        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.println("Output: " + output);

    }
}
