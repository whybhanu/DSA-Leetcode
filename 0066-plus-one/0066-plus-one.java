class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int[] newArr = new int[digits.length + 1];
        int carry = 1;
        int sum = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            sum = carry + digits[i];
            if(sum > 9){
                digits[i] = sum%10;
                newArr[i + 1] = digits[i];
                carry = 1;
            } else {
                digits[i] = sum;
                return digits;
            }
        }
        if(carry == 1){
            newArr[0] = 1;
            return newArr;
        }
        return digits;
    }
} 