class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int org = x;
        int r = 0;
        if(x < 0){
            return false;
        }
        while(x != 0){
            int digit = x%10;
            r = r*10 + digit; 
            x /= 10;
        }
        if(org == r)
            return true;
        else
            return false;
    }
}