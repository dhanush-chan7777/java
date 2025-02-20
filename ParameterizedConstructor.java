class Book{
    String Title;
    String Author;
    double Price;
    
    Book( String Title,String Author,double Price){
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
    
}
void display(){
    System.out.println("Author:"+Author);
        System.out.println("Title:"+Title);
    System.out.println("Price:"+Price);
}
    
}
public class ParameterizedConstructor{
    public static void main(String []args){
        Book obj=new Book("Java","Abc",100.90);
        obj.display();
    }
}
