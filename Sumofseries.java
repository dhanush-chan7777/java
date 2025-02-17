public class Sumofseries
{
	public static void main(String[] args) {
		int n=5;
		int l=0;
		int m=5;
		int k=4;
		for(int i=1;i<=k;i++){
		    m=(m*10)+n;
		    System.out.print(m);
		    l+=m;
		}
		System.out.println(l);
}
}
