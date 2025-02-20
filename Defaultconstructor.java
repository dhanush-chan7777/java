
class Book{
    String Title;
    double Price;
    Book(){
        Title="Java Programing";
        Price=100.0;
        
    }
    
    }
    
public class Defaultconstructor{
    public static void main(String []args){
        Book obj=new Book();
        System.out.println("Book Title::"+obj.Title);
        System.out.println("Book Price::"+obj.Price);
    }
}    
