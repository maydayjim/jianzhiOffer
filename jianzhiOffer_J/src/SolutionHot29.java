import java.util.LinkedHashMap;
public class SolutionHot29 {
        public int FirstNotRepeatingChar(String str) {
            if (str == null || str.length() == 0)
                return -1;
            char[] c = str.toCharArray();
            LinkedHashMap<Character,Integer> hash=new LinkedHashMap<Character,Integer>();

            for(char item : c) {
                if(hash.containsKey(item))
                    hash.put(item, hash.get(item)+1);
                else
                    hash.put(item, 1);
            }

            for(int i = 0;i < str.length(); i++){
                if (hash.get(str.charAt(i)) == 1) {
                    return i;
                }
            }
            return -1;
        }
}
