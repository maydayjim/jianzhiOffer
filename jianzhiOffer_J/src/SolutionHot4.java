//可以用递归，不过很慢，所以用这种僵硬的方法

public class SolutionHot4 {
    public int JumpFloor(int target) {
        if (target <= 2)
            return target;
        int stepOne = 1;
        int stepTwo = 2;
        while (target>2) {
            stepTwo = stepOne + stepTwo;
            stepOne = stepTwo - stepOne;
            target--;
        }
        return stepTwo;

    }
}
