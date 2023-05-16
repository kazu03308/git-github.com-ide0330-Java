import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] tmp = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i][j] = sc.nextInt();
            }
        }
        boolean ok = false;
        for(int rota=0;rota<4;rota++){
            boolean allEqual = true;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(A[i][j]==1 && B[i][j]==0){
                        allEqual=false;
                    }
                }
            }
            if(allEqual){
                ok=true;
                break;
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    tmp[i][j]=A[i][j];
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    A[i][j] = tmp[N-1-j][i];
                }
            }


        }

        if(ok){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
