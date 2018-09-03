public class SolutionHot14 {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        int exp=0;
        double result=1;
        if (exponent > 0)
            exp = exponent;
        else
            exp = -exponent;
        while (exp > 0) {
            result *= base;
            exp--;
        }
        if (exponent < 0)
            result = 1/result;
        return result;
    }
//这是判断浮点或者双精度是不是0的方法
//    public  int isZero(double a){
//        if(a>-0.000001&&a<0.000001){
//            return  1;
//        }else {
//            return 0;
//        }
//    }
//
//    public
}
