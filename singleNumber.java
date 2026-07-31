public class singleNumber {
    public int singleNumberr(int[] nums) {
        int xorResult = 0;
        for(int num : nums) {
            xorResult ^= num ;
        }
        return xorResult;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};

        singleNumber s1 = new singleNumber();
        int result = s1.singleNumberr(nums);

        System.out.println("single numbers is : "+result);
    }
}
