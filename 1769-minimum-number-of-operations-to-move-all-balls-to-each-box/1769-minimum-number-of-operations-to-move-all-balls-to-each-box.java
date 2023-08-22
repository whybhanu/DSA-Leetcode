class Solution {
    public int[] minOperations(String boxes) {
        int[] boxPos = new int[boxes.length()];
        int idx = 0;
        int p1 = 0;
        int p2 = boxes.length() - 1;
        while(idx != boxPos.length){
            int count = 0;
            while(p1 < idx){
                if(boxes.charAt(p1) != '0'){
                    count += idx - p1;
                }
                p1++;
            }
            while(p2 > idx){
                if(boxes.charAt(p2) != '0'){
                    count += p2 - idx;
                }
               p2--;
            }
            boxPos[idx] = count;
            idx++;
            p1 = 0;
            p2 = boxes.length() -1;

        }
        return boxPos;
    }
}