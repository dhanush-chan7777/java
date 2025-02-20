import java.util.Scanner;
class Student {
	void Name(String arr1[],int arr2[]) {

        for(int i=0;i<5;i++){
            
        
		System.out.println("NAME::"+arr1[i]);
		System.out.println("Reg no::"+arr2[i]);
	}

}
}

public class ClassandObject {
	public static void main(String []args) {

		Scanner s=new Scanner(System.in);
        String[] a=new String[5];
        int[] b=new int[5];
for(int i=0;i<5;i++){
    

      	System.out.print("Enter a NAME::");
		a[i]=s.nextLine();
		System.out.print("Enter a Regno::");
		b[i]=s.nextInt();
		s.nextLine();
}
		Student Obj=new Student();
		Obj.Name( a, b);
	}
}
