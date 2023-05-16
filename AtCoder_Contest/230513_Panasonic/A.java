import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int tNum=0,aNum=0;
        String winner="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='T'){
                tNum++;
                winner="A";
            }else if(S.charAt(i)=='A'){
                aNum++;
                winner="T";
            }
        }
        if(tNum>aNum){
            System.out.println("T");
        }else if(aNum>tNum){
            System.out.println("A");
        }else if(tNum==aNum){
            System.out.println(winner);
        }
    }
}
