class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = {2,3,5};
        int[] count ={0,0,0};
        int[] a = new int[n];
        a[0]=1;
        int j=1;
        while(j!=n){
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < 3; i++) {
            int product = arr[i] * a[count[i]];
            if (product < minVal) {
                minVal = product;
                minIndex = i;
            }
            }
            a[j]=minVal;;
            for(int i = 0; i < 3; i++){
                if (arr[i] * a[count[i]] == minVal) {
                    count[i]++;
                }
            }
            j++;
        }
        return a[n-1];
    }
}