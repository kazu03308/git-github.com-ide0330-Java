import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        for(int i=0;i<A.size()-1;i++){
            int pre = A.get(i);
            int back = A.get(i+1);
            if(pre<back+1){
                int tmp=pre+1;
                while(tmp<back){
                    A.add(++i,tmp);
                    tmp++;
                }
            }else if(pre>back+1){
                int tmp=pre-1;
                while(tmp>back){
                    A.add(++i,tmp);
                    tmp--;
                }
            }
        }
       for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+" ");
        }
    }
}
