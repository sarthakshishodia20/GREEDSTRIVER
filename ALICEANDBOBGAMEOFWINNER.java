class Solution {
    public boolean winnerOfGame(String colors) {
        int A=0;
        int B=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                A++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                B++;
            }
        }
        return A>B;
    }
}
