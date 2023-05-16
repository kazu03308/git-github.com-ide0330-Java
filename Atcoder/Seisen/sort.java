import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer a[] = new Integer[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());
        int diff = 0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                diff+=a[i];
            }else{
                diff-=a[i];
            }
        }
        System.out.println(diff);
    }
}
