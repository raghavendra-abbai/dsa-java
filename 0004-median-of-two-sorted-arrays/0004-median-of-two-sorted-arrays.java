class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                res[k] = nums2[j];
                k++ ; 
                j++ ;

            } else {
                res[k] = nums1[i];
                    k++;
                    i++;
                
            }
        }

        while (i < nums1.length){
             res[k] = nums1[i];
             i++ ; 
             k++ ;

        }
        while (j < nums2.length){
            
             res[k] = nums2[j] ; 
             j++ ; 
             k++ ;
             
             }

        int n = res.length;
        return n % 2 == 0 ? ((double) res[n / 2 - 1] + res[n / 2]) / 2 : res[n / 2];
    }
}