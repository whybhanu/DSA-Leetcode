class Solution {
    public double average(int[] salary) {
        quickSort(salary, 0, salary.length-1);
        Arrays.sort(salary);
        double sum = 0;
        int start = 1;
        while(start < salary.length - 1){
            sum = salary[start] + sum;
            start++;
        }
        return (sum)/(salary.length - 2);
        
    }

    void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = (low + high)/2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }

            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

            quickSort(nums, low, end);
            quickSort(nums, start, high);
        }
    }
}