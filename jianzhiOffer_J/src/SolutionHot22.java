import java.util.ArrayList;
public class SolutionHot22 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int length = matrix[0].length;
        int height = matrix.length;
        ArrayList<Integer> printArray= new ArrayList<>();
        if(matrix == null){
            return printArray;
        }
        int num = 0;
        //int way = 0;//0右1下2左3上
        int rightX = length-1;
        int underY = height-1;
        int leftX = 0;
        int upY = 0;
        while (num < length*height){
            for (int i = leftX; i <=rightX ; i++) {
                printArray.add(matrix[upY][i]);
                num++;
            }rightX--;
            if(num>=length*height)break;
            for (int i = upY+1; i <= underY; i++) {
                printArray.add(matrix[i][rightX+1]);
                num++;
            }underY--;
            if(num>=length*height)break;
            for (int i = rightX; i>=leftX ; i--) {
                printArray.add(matrix[underY+1][i]);
                num++;
            }leftX++;
            if(num>=length*height)break;
            for (int i = underY; i > upY ; i--) {
                printArray.add(matrix[i][leftX-1]);
                num++;
            }upY++;
            if(num>=length*height)break;
        }

        return printArray;
    }
}
