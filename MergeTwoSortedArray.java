class MergeTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        double mid = 0;
        for (int s = 0; s < temp.length; s++) {
            if (temp.length % 2 == 0) {
                mid = (temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2.0;
            } else {
                mid = temp[temp.length / 2];
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1};
        int[] nums2 = {2, 2};


        MergeTwoSortedArray s1 = new MergeTwoSortedArray();
        System.out.println("The median of two sorted array is : " + s1.findMedianSortedArrays(nums1, nums2));

    }
}