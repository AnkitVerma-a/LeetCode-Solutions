class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int m=intervals.length;
        int n=intervals[0].length;
        int start=intervals[0][0];
        int i=0;
        while(i+1<m){
            int n1=intervals[i+1][0];
            int n2=intervals[i][n-1];
            if(n1<=n2){
                i++;
                continue;
            }else{
                ans.add(Arrays.asList(start,n2));
                start=n1;
                i++;
                continue;
            }
        }
        ans.add(Arrays.asList(start,intervals[m-1][n-1]));
        int[][] arr = ans.stream()
        .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
        return arr;
    }
}