class Solution {
    public int reverse(int x) {  
        int MAX_INT = 2147483647;
        boolean isNegative = false;
        
        if (x < 0) {
            x *= -1;
            isNegative = true;
        }
        
        
        int[] intArray = new int[String.valueOf(x).length()];
        int index = 0;
        
        while (x > 0) {
            int tmp = x % 10;            
            intArray[index] = tmp;
            x = x / 10;
            index += 1;
        }
        
        int sum = 0;
        for (int i = intArray.length - 1; i>=0; i--){
            if ((sum + intArray[i] * Math.pow(10, intArray.length - 1 - i)) > MAX_INT) {
                return 0;
            }
            sum += intArray[i] * Math.pow(10, intArray.length - 1 - i);
        }
        
        if (isNegative) {
            sum *= -1;
        }
        
        return sum;   
    }
}
