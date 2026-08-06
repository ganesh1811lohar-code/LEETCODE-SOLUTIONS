public class InsertPositionOfNumberBinarySearch {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == nums[mid]) {
                return mid;
            } else if(target < nums[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[]args) {
        int[] nums = {1,3,5,7};
        int target = 5;

        InsertPositionOfNumberBinarySearch s1 =new InsertPositionOfNumberBinarySearch();
        int result = s1.searchInsert(nums,target);

        System.out.println(result);
    }
}