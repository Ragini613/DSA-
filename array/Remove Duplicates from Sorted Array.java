class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0)
        return 0;          // edge case

        int i = 0;                     // last unique ka index
        int unique = 1;                // unique elements ki count
        int j = 1;                     // scanner

        while (j < n) {
            if (nums[j] == nums[j - 1]) {   
                j++;
                continue;                    
            }
            nums[i + 1] = nums[j];     
            i++;
            unique++;
            j++;
        }
        return unique;
    }
}