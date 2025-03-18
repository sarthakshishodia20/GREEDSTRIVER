class Solution {
    static int solve(int bt[] ) {
    // code here
    int t=0;
    int wtTime=0;
    Arrays.sort(bt);
    for(int i=0;i<bt.length;i++){
        wtTime+=t;
        t=t+bt[i];
    }
    return (wtTime/bt.length);
  }
}
     
