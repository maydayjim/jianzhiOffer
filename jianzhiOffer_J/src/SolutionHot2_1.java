public class SolutionHot2_1 {
    public String replaceSpace(StringBuffer str){
        String oldstr = new String(str);
        char[] oldArray = oldstr.toCharArray();
        int oldLength = oldArray.length;
        int blankNum = 0;
        for(char item :oldArray){
            if(item == ' '){
                blankNum++;
            }
        }
        int newLength = oldLength + blankNum*2;
        char[] newArray = new char[newLength];
        int sign1 = oldLength-1;
        int sign2 = newLength-1;
        while (sign1>=0){
            if(oldArray[sign1]==' '){
                newArray[sign2--]='0';
                newArray[sign2--]='2';
                newArray[sign2--]='%';
                sign1--;
            }else {
                newArray[sign2--]=oldArray[sign1--];
            }
        }

        return String.valueOf(newArray);
    }
}
