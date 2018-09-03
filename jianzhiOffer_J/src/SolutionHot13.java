public class SolutionHot13 {
    public void reOrderArray(int [] array) {
        if(array == null)
            return ;

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            if(array[i] % 2 != 0){
                while(j >= 0){
                    if(array[j] % 2 != 0){
                        break;
                    }
                    if(array[j]%2 == 0){
                        int t = array[j+1];
                        array[j+1] = array[j];
                        array[j] = t;
                        j--;
                    }
                }
            }
            array[j+1] = temp;
        }

    }
}
