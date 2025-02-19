import java.util.Scanner;
public class Matrixtranspose{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=3;int m=3;
        int a[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix form::");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        

        
        
    }
}
