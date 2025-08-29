class Solution {
    public boolean isPalindrome(int x) {
        int orinum = x;
        int revnum = 0;
        if(x < 0){
            return false;
        }
        while(x != 0){
            int digit = x % 10;
            revnum = revnum * 10 + digit;
            x = x / 10;
        }
        if(orinum == revnum){
            return true;
        }
        return false;
        
        
    }
}