public class Monitor {
    // Variable is a property or characteristics of the object
     int size ; // Access specofier or access modifier
    private int prize;
    static String bodyType= "Plastic";
    String brandName;
    String resolution;
    Monitor(int sizeNumber, int p, String brand, String resolString){
        size = sizeNumber;
        prize=p;
        brandName=brand;
        resolution=resolString;
    }
    public int getPrice(){
        return prize;
    }

  
    // Purpose of the monitor defined in the form method
    void displayConnectedLaptop(int a){
        System.out.println("Display connected devices");
    }
    public static void main(String args[]){
        Monitor m1 = new Monitor(13, 6000, "Dell","1300");
        System.out.println(m1.size);
        m1.displayConnectedLaptop(5);
        Monitor m2 = new Monitor(15, 9000, "LG","1600");
        System.out.println(m2.size);
        System.out.println("build type"+Monitor.bodyType);
        // Monitor m2 = new Monitor();
        // System.out.println(m2.size);

        // Monitor m3 = new Monitor();
        // System.out.println(m3.size);


    }
}
