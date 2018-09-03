import java.util.ArrayList;
public class SolutionHot25 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k>input.length||input==null||input.length==0){
            return  list;
        }
        for (int i = 0; i < k; i++) {
            int tmp = input[0];
            for (int j = 0; j < input.length-i-1; j++) {
                if(input[j]<input[j+1]){
                    tmp = input[j];
                    input[j]=input[j+1];
                    input[j+1] = tmp;
                }
            }
            list.add(input[input.length-1-i]);
        }
        return  list;

    }
}
