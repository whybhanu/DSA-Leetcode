class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((s1, s2) -> {
            if(s1.length() == s2.length()) return s1.compareTo(s2);
            else return Integer.compare(s1.length(), s2.length());
        });
        for(String s: nums){
            pq.add(s);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}