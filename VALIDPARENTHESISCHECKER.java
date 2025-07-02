class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        Boolean[][] dp=new Boolean[n+1][n+1];
        return helper(s,0,0,dp);
    }
    public static boolean helper(String str,int index,int openCount,Boolean[][] dp){
        if(openCount<0 || openCount>str.length()){
            return false;
        }
        if(index==str.length()){
            dp[index][openCount]=openCount==0;
            return dp[index][openCount];
        }
        if(dp[index][openCount]!=null){
            return dp[index][openCount];
        }
        boolean ans=false;
        if(str.charAt(index)=='('){
            ans=helper(str,index+1,openCount+1,dp);
        }
        else if(str.charAt(index)==')'){
            ans=helper(str,index+1,openCount-1,dp);
        }
        else{
            ans=helper(str,index+1,openCount+1,dp)||helper(str,index+1,openCount-1,dp)||helper(str,index+1,openCount,dp);
        }
        dp[index][openCount]=ans;
        return dp[index][openCount];
    }
}
