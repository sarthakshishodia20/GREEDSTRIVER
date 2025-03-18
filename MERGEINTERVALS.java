class Solution {
    static class Pair {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        List<Pair> list = new ArrayList<>();
        for (int[] interval : intervals) {
            list.add(new Pair(interval[0], interval[1]));
        }
        List<Pair> merged = new ArrayList<>();
        for (Pair pair : list) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).end < pair.start) {
                merged.add(pair);
            } else {
                Pair last = merged.get(merged.size() - 1);
                last.end = Math.max(last.end, pair.end);
            }
        }
        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i][0] = merged.get(i).start;
            result[i][1] = merged.get(i).end;
        }

        return result;
    }
}
