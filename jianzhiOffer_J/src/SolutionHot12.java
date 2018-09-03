public class SolutionHot12 {
    //还是斐波那契数列，记下怎么推算第n项
    public int RectCover(int target) {
        int number = 1;
        int sum = 1;
        if (target <= 0)
            return 0;
        if (target == 1 ) {
            return 1;
        }

        while (target >1) {
            sum += number;
            number = sum - number;
            target--;
        }
        return sum;
    }
}
