public class FirstAndLastOccureanceinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }
    public int binarySearch(int[] nums , int target , boolean first) {
        int start =0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                ans = mid;

                if(first) {
                    end = mid - 1;
                } else {
                    start = mid +1;
                }
            } else if(nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstAndLastOccureanceinSortedArray s1 = new FirstAndLastOccureanceinSortedArray();
        int[] result = s1.searchRange(nums,target);

        for(int i =0 ; i< result.length;i++) {
            System.out.println(result[i]);
        }
    }
}