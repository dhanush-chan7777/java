public class LexicographicalAnagram{
	public static void main(String[] args){
	   String s="hacker";
	   int k=3;
	 int i=1;
	 while(s.length()>k){
	 String sub=s.substring(i,k+1);
       i=k;
       k+=k-1;
	   System.out.println(sub);
	}
	}
}
