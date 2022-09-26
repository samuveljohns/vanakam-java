public class ITDepartment {
    public static void main(String args[]){
        Monitor[] monitors = new Monitor[4];
        Monitor m1 = new Monitor(13, 6000, "Dell","1300");
   //     monitors[0]= m1;
        Monitor m2 = new Monitor(13, 6000, "Dell","1300");
      //  monitors[1]= m2;
        System.out.println(m1.getPrice());
        System.out.println(m1.size);
        m1.size = 20;
        m1.price = 1000;

    
    }
}
