class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] neg = new int[nums.length];
        int[] pos = new int[nums.length];
        int nc = 0, pc = 0;

        for (int x : nums) {
            if (x < 0) { neg[nc] = x * x; nc++; }
            else       { pos[pc] = x * x; pc++; }
        }

        int a = 0, b = nc - 1;
        while (a < b) {
            int temp = neg[a]; neg[a] = neg[b]; neg[b] = temp;
            a++; b--;
        }

        int[] res = new int[nums.length];
        int i = 0, j = 0, k = 0;

        while (i < nc && j < pc) {
            if (neg[i] < pos[j]) { res[k] = neg[i]; i++; }
            else                 { res[k] = pos[j]; j++; }
            k++;
        }
        while (i < nc) { res[k] = neg[i]; i++; k++; }
        while (j < pc) { res[k] = pos[j]; j++; k++; }

        return res;
    }
}