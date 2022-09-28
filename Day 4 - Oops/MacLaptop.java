package vanakam-java.Day 4 - Oops;

abstract class UsbAdapter{
    void display(){
        
        // 1000 lines of code to display the output
    }
    abstract void doConnectWithUsbDevice();
}
public class MacLaptop extends UsbAdapter{
    void doConnectWithUsbDevice(){
        //
    }
    MacLaptop adapter = new MacLaptop();
}
