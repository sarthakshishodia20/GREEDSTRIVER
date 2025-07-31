class Solution {
    static class Pair{
        int start;
        int end;
        public Pair(int s,int e){
            this.start=s;
            this.end=e;
        }
    }
    public int findMinArrowShots(int[][] points) {
        List<Pair> list=new ArrayList<>();
        for(int[] pon:points){
            int start=pon[0];
            int end=pon[1];
            list.add(new Pair(start,end));
        }
        Collections.sort(list,(a,b)->Integer.compare(a.end,b.end));
        int arrows=1;
        int lastEnd=list.get(0).end;
        for(int i=1;i<list.size();i++)
        {
            Pair curr=list.get(i);
            if(curr.start>lastEnd){
                arrows++;
                lastEnd=curr.end;
            }
        }
        return arrows;
    }
}
