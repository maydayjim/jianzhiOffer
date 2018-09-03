public class SolutionHot31 {
    public int Sum_Solution(int n) {
        //如果n为零了自然就会停止后面的判断了，达到了if的效果
        int sum = n;
        boolean result = (n > 0) && ((sum += Sum_Solution(n-1)) > 0);
        return sum;
    }
}
