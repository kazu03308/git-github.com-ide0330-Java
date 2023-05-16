import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<List<Integer>> hako = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            hako.add(new ArrayList<Integer>());
        }
        for(int k=0;k<Q;k++){
            int querry = sc.nextInt();
            if(querry == 1){
                int i = sc.nextInt();
                int j = sc.nextInt();
                hako.get(j).add(i);
            }else if(querry == 2){
                int i = sc.nextInt();
                List<Integer> tmp = hako.get(i);
                Collections.sort(tmp);
                for(int j=0;j<tmp.size();j++){
                    System.out.print(tmp.get(j)+" ");
                }
                System.out.println("");

            }else{
                int i = sc.nextInt();
                for(int j=0;j<hako.size();j++){
                    if(hako.get(j).contains(i)){
                        System.out.print(j+" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
