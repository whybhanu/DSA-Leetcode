class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String value : arr){
            //converting the single single values in to single single characters
            char[] c = value.toCharArray();

            // swapping the values
            swap(c);

            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }

    // swapping the array
    void swap(char[] c){
        int i = 0;
        int j = c.length - 1;
        while(i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }

    }
}