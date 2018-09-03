public class SolutionHot8 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if (len == 0) return  0;
        int index = len -1 ;
        while (index>0){
            if(array[index]<array[index-1]){
                break;
            }
            index--;
        }
        return array[index];

    }
}
