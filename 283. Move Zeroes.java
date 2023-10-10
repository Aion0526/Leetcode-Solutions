class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        int last = nums.length - 1;
        int first = 0;
        int curr = 0;
        while(curr <= last && first < last) {
            if(nums[curr] != 0) {
                int temp = nums[first];
                nums[first] = nums[curr];
                nums[curr] = temp;
                first++;
                curr++;
            } else {
                curr++; 
            }
        }
    }
}