class Solution {
    public int search(int[] nums, int target) {
          return binarySearch(nums, target, 0, nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s +(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        //Case 1 :
        if (arr[s]<= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return binarySearch(arr, target, s, m-1);
            }else {
                return binarySearch(arr, target, m+1, e);
            }
        }
        //Case 2 :
        if (target >= arr[m] && target <= arr[e]){
            return binarySearch(arr, target, m+1, e);
        }//case 3 :
        return binarySearch(arr, target, s, m-1);
    }

}