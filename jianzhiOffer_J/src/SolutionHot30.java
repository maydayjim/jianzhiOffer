import java.util.ArrayList;
public class SolutionHot30 {
    //我是王者
    public ArrayList<String> Permutation(String str) {
        char[] c = str.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        if(str == null||str.length() == 0){
            return list;
        }
        if(str.length() == 1){
            list.add(str);
            return list;
        }
        for (int i = 0; i <str.length();i++) {
            String substr = str.substring(0,i)+str.substring(i+1,str.length());
            ArrayList<String> sublist = new ArrayList<>();
            sublist = Permutation(substr);
            for(String item : sublist){
                String temstr = c[i] + item;
                if(list.contains(temstr) != true){
                    list.add(temstr);
                }
            }
        }

        return list;

    }

}
