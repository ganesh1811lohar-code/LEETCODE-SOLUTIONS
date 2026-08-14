import java.util.HashSet;

class DuplicateContain {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        DuplicateContain c1 = new DuplicateContain();
        System.out.println(c1.containsDuplicate(nums));
    }
}