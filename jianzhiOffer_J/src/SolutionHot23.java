import java.util.Arrays;
public class SolutionHot23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        //方法，【左子树右子树根节点】，验证是否结构是这样
        if(sequence == null ||sequence.length == 0){
            return  false;
        }
        int root  = sequence[sequence.length - 1];
        int mark = 0;
        for (; mark < sequence.length ; mark++) {
            if(sequence[mark] > root) break;
        }
        int mark2 = mark;
        for (; mark2 < sequence.length; mark2++) {
            if(sequence[mark2]<root) return false;
        }

        boolean left = true;
        if(mark>0){
            int[] leftSeq = Arrays.copyOfRange(sequence,0,mark);
            left = VerifySquenceOfBST(leftSeq);
        }

        boolean right = true;
        if(mark2<sequence.length-1){
            int[] rightSeq = Arrays.copyOfRange(sequence,mark,sequence.length-1);
            right = VerifySquenceOfBST(rightSeq);
        }
        return (left&&right);



    }
}
