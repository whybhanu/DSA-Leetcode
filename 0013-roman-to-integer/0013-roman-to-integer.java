class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rToInteger = new HashMap<>();
        rToInteger.put('I', 1);
        rToInteger.put('V', 5);
        rToInteger.put('X', 10);
        rToInteger.put('L', 50);
        rToInteger.put('C', 100);
        rToInteger.put('D', 500);
        rToInteger.put('M', 1000);
        
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(rToInteger.get(s.charAt(i)) < rToInteger.get(s.charAt(i + 1))){
                sum = sum - rToInteger.get(s.charAt(i));
            } else{
                sum = sum + rToInteger.get(s.charAt(i));
            }
        }
        
            return sum + rToInteger.get(s.charAt(s.length() - 1));
    }
}