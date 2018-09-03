public class SolutionHot34 {
    public int GetNumberOfK(int [] array , int k) {
        int count= 0;
        if(array == null||array.length == 0){
            return count;
        }
        for (int i = 0; i < array.length ;i++) {
            if(array[i]>k){
                break;
            }
            if(array[i] == k){
                count++;
            }
        }
        return count;


    }
}
