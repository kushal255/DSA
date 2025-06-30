            if(nums[mid]<0){
            int mid = (start + end)/2;
        while(start <= end){
        int end = nums.length-1;
        int ans = -1;
    public int lastNegative(int[] nums){
        int start = 0;
        return Math.max(lastNegative, firstPositive);
    }
        int lastNegative = lastNegative(nums)+1;
        int firstPositive = nums.length - firstPositive(nums);
                ans = mid;
                start = mid +1;
            }else{
                end = mid-1;
            }
           
        }
         return ans;