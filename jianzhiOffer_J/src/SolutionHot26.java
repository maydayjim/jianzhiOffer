public class SolutionHot26 {
    //连续子数组的最大和。一个储存当前和，小于零就丢掉这一串，一个储存最大和
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int cur = array[0];
        int greast = array[0];

        for (int i = 1; i < array.length; i++) {
            if (cur < 0) {
                cur = array[i];
            }else {
                cur += array[i];
            }

            if (cur > greast) {
                greast = cur;
            }
        }
        return greast;
    }
}
