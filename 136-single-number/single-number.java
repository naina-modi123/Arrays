class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int XOR = 0;
        for(int i=0;i<n;i++){
            XOR = XOR^nums[i];
        }return XOR;
    }
}