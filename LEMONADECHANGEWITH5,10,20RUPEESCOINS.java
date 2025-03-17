class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum5=0;
        int sum10=0;
        int sum20=0;
        for(int i=0;i<bills.length;i++){
            switch(bills[i]){
                case 5:{
                    sum5++;
                }
                break;
                case 10:{
                    if(sum5==0){
                        return false;
                    }
                    else{
                        sum5--;
                        sum10++;
                    }
                    break;
                }
                case 20:{
                    if(sum5>0 && sum10>0){
                        sum20++;
                        sum5--;
                        sum10--;
                    }
                    else if(sum5>2){
                        sum5-=3;
                        sum20++;
                    }
                    else{
                        return false;
                    }
                    break;
                }
                
            }
        }
        return true;
    }
}
