import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        Map<Character,Integer> all = new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(sMap.get(S.charAt(i)) == null){
                sMap.put(S.charAt(i),1);
            }else{
                sMap.put(S.charAt(i), sMap.get(S.charAt(i))+1);
            }
            if(tMap.get(T.charAt(i)) == null){
                tMap.put(T.charAt(i),1);
            }else{
                tMap.put(T.charAt(i), tMap.get(T.charAt(i))+1);
            }
            if(all.get(T.charAt(i)) == null){
                all.put(T.charAt(i),1);
            }
            if(all.get(S.charAt(i)) == null){
                all.put(S.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> entry : all.entrySet()){
            char tmpChar = entry.getKey();
            int charNum = entry.getValue();
            //@の数
            //存在しなかったら0
            //少ないほうの@の数を減らす。なかったらfalse
        }

        
    }
}
