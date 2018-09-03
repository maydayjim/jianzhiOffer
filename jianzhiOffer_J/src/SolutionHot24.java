import java.util.Stack;

public class SolutionHot24 {
    //思路：为了找出次数超过一半的家伙，用栈的入栈出栈来搞.但加入不存在这个数，就会有其他数字假冒，所以需要验证一波
    public int MoreThanHalfNum_Solution(int [] array) {
        Stack<Integer> guys  = new Stack<>();
        if(array == null||array.length == 0){
            return  0;
        }

        for (int i = 0; i < array.length; i++) {
            if(guys.isEmpty()||guys.peek() == array[i]){
                guys.push(array[i]);
            }
            if(guys.peek()!= array[i]){
                guys.pop();
            }
        }

        if(guys.isEmpty()){
            return  0;
        }
        //存在这种数会对，但不存在的话，可能就赝品字啊那个位置，所以带回去验证一下
        int a = guys.peek();
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if(a == array[i]){
                count++;
            }
        }
        if(count>array.length/2){
            return a;
        }else {
            return 0;
        }
    }
}
