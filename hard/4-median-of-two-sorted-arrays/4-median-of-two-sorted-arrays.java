                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        int len = merged.length;
        if (len % 2 == 1) {
            return merged[len / 2];
            if (nums1[i] < nums2[j]) {
        while (i < nums1.length && j < nums2.length) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[nums1.length + nums2.length];
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
class Solution {