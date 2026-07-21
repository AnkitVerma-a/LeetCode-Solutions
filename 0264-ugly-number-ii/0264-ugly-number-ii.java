class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = {2, 3, 5};
        int[] pointers = {0, 0, 0}; 
        int[] a = new int[n];
        a[0] = 1;
        int j = 1;
        while (j < n) {
            int v0 = a[pointers[0]] * arr[0];
            int v1 = a[pointers[1]] * arr[1];
            int v2 = a[pointers[2]] * arr[2];
            int minVal = Math.min(v0, Math.min(v1, v2));
            a[j] = minVal;
            if (minVal == v0) pointers[0]++;
            if (minVal == v1) pointers[1]++;
            if (minVal == v2) pointers[2]++;
            j++;
        }
        return a[n - 1];
    }
}
