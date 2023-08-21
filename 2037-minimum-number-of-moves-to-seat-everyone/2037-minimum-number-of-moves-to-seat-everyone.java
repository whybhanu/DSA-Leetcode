class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] != students[i]){
                int increase = students[i];
                int decrease = students[i];
                while(increase != seats[i] && decrease != seats[i]){
                    increase++;
                    decrease--;
                    count++;
                }
            }
        }
        return count;
    }
}