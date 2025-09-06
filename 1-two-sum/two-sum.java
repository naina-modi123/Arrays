class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
		HashMap<Integer , Integer> mpp = new HashMap<>();
		int ans[] = new int[2];
		ans[0] = ans[1] = -1;
		for(int i=0;i<n;i++){
			int num = nums[i];
			int moreneeded = target - num;
			if(mpp.containsKey(moreneeded)){
				ans[0] = mpp.get(moreneeded);
				ans[1] = i;
				return ans;
			}
			mpp.put(nums[i] , i);
		}
		return ans;
    }
}