class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int a = 0;
        int temp = x;
        while(temp != 0){
            int z = temp % 10;
            a = (a * 10) + z;
            temp = temp/10;
        }
        if(x == a){
            return true;
        }
        return false;
    }
}