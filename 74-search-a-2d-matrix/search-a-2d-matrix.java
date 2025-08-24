class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n = matrix.length;
       int m = matrix[0].length;
       for(int i=0;i<n;i++){
        if(matrix[i][0] <= target && target <= matrix[i][m-1]){
            return binarySearch(matrix[i], target);
        }
       }
       return false;
    }
    public static boolean binarySearch(int[] matrix,int target){
        int n = matrix.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[mid] == target)return true;
            else if(target > matrix[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}