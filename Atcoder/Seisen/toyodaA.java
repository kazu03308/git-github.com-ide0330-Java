import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String S = sc.next();
        boolean hasGood = false;
        boolean hasBad=false;
        if(S.contains("o")){
            hasGood=true;
        }
        if(S.contains("x")){
            hasBad=true;
        }
        if(hasGood && !hasBad){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
