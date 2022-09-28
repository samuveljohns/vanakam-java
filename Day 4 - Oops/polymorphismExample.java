public class polymorphismExample{
    int area(int length,int breath){
       // System.out.println("Area of rectange");
      return length*breath;
    }
    int area(int length){
        // System.out.println("Area of triange");
       return length*length;
    }
    public static void main(String args[]){
        polymorphismExample ex = new polymorphismExample();
        System.out.println("area"+ex.area(5));
    }
 }
 

 