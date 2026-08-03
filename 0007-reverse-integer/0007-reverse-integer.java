class Solution {
    public int reverse(int x) {
        int finalResult = 0;
        
        while (x != 0) {
            int digit = x % 10;
            
            // Check for overflow before multiplying by 10
            if (finalResult > Integer.MAX_VALUE / 10 || (finalResult == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            
            // Check for underflow before multiplying by 10
            if (finalResult < Integer.MIN_VALUE / 10 || (finalResult == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            finalResult = finalResult * 10 + digit;
            x = x / 10;
        }
        
        return finalResult;
    }
}