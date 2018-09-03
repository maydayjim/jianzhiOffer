public class SolutionHot1 {
    public boolean Find(int target,int[][] array){
        int x=0;
        int len = array[0].length;
        int y = len - 1;
        int sign ;
        while (x < len && y >=0){
            sign = array[x][y];
            if(sign == target){
                return  true;
            }
            if(sign> target){
                y--;
            }else {
                x++;
            }
        }
        
        return false;

    }
}
