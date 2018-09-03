import java.util.ArrayList;
public class SolutionHot37 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {


        ArrayList<Integer> list = new ArrayList<>();
        if(array == null&&array.length<2){
            return list;
        }
        int num1 = 0;
        int num2 = array.length-1;
        int flag = 0;
        long chengji = 0;
        for ( ; num1 <= num2; num1++) {
            for (int i = num2; i >= num1 ; i--) {
                if(array[num1]+array[i] == sum){
                    if(flag == 0||array[num1]*array[i]<chengji){
                        list.add(array[num1]);
                        list.add(array[i]);
                        chengji = array[num1]*array[i];
                        flag++;
                    }
                    num2 = i;
                    break;
                }
            }

        }
        return list;
    }
}
