class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1)/2);
        int check = 0;
        for(int i=0;i<n;i++){
            check += nums[i];
        }
        int ans = sum - check;
        return ans;
    }
}