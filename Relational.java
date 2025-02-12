class Relational{
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        
        // short circiut 
    if(a>b && a>c){
        System.out.println("a is grater than b & c:"+(a>b));
     }
      else if(b>a || b>c){
        System.out.println("b is grater than a & c:"+(c<a));
      }
      else{
          System.out.println("c is grater than a & b:");
      }
      
      // non short circuit
      System.out.println("A is the greatest::"+(a>b && a>c));
            System.out.println("B is the greatest::"+(a<b && b>c));
      System.out.println("C is the greatest::"+(a<c && b<c));

    }
}
