import java.util.ArrayList;

public class SolutionHot35 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null||array.length<2){
            return;
        }
        int[] tmp = array.clone();
        //System.out.println(tmp[0]+tmp[2]);
        ArrayList<Integer> numbad = new ArrayList<>();
        for (int i = 0; i <tmp.length ; i++) {
            if(numbad.contains(tmp[i]) == true){
                continue;
            }
            for (int j = i+1; j < tmp.length; j++) {
                if(numbad.contains(tmp[j]) == true){
                    continue;
                }
                if(tmp[i]==tmp[j]){
                    numbad.add(tmp[i]);
                    numbad.add(tmp[j]);
                    break;
                }
            }
        }
        int flag =0;
        for (int i = 0; i < tmp.length; i++) {
            if (numbad.contains(tmp[i])!=true){
                if(flag == 0){
                    num1[0] = tmp[i];
                    flag++;
                }else {
                    num2[0] = tmp[i];
                }
            }
        }
    }
}
