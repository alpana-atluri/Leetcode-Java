class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        if (x < 10) {
            return true;
        }
        
        int[] intArray = new int[String.valueOf(x).length()];
        int index = 0;
        
        while (x > 0) {
            int num = x % 10;            
            intArray[index] = num;
            x = x / 10;
            index += 1;
        }
        boolean answer = true;
        for (int i = 0; i<intArray.length; i++){
            if (intArray[i]!=intArray[intArray.length-1-i]){
                return false;
            }
        }
        
        return answer;
    }
}