import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class testMain {
    public static void main(String[] args) {
        SolutionHot37 solutionHot37 = new SolutionHot37();
        int[] a = {1,2,4,7,11,15};
        Iterator list = solutionHot37.FindNumbersWithSum(a,15).iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
}
