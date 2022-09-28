Day 3:
1. **Method**
   1. Used to execute certain statement.
2. **Constructor**
   1. Special type of method
   2. It has same name as class name
   3. Various of types of constructor are there (default constructor, parameterized constructors)
   4. No need to mention return type
   5. What is the purpose of the constructor?
      1. It helps to initialize the values immediatly after object creation
    
**3. Oop**
    1. ***Class***
       1. It describes about class
       2. In java everything is a class
       3. We can't write a Java program without class keyword
         ```
            class <classname>{
             ...
            }
         ```
    2. ***Object***
       1. It is a behaviour of the class.
       2. Realtime entity
       3. Object is also called instance.
      ```new <constructor>();```
      ```Ex: Monitor m = new Monitor(); 
      ```
    3. ***Encapsulation***
       1. Data hiding
       2. but it show allow the functionality
       3. <u>Why?</u> 
          1. To avoid unauthorized access
          2. Ex: Card number prints with xxxx
       4. <u>What?</u>
             1. What is data in the program
             2. The values we store in a variable is called "Data"
       5. <u>How?</u>
          1. Make a variable as private
          2. expose the value of the variable in public method;
    4. ***Inheritance***
       1. Acquiring the properties of another class.
       Why?
       1. We can reuse the functionality.
       2. Less number of line of code.
       3. Better readability.
       4. If you change in one place it will be changed in derived class
       5. Example    
      
   ```      
        Person
            1. name
            2. age
            3. dob
            4. address
            5. phnumber
            6. aadhar
         1. Student
            
            1. phnumbe
            2. rollno
            3. department
         2. Proffessor
            
            1. department
            2. qualification
         3. Driver
            
            1. busNumber
            2. busRouteNumber
   ```
   Assignment:
         1. Write a program in Java 
         2. to maintain different types of Goods
         3. Goods are like Book, CD, Pen
         4. Goods have common properties like name, price, isImportedOrNot, tax
         5. Each item has different properties like 
            1. Book has Softcopy version and hardcopy version
            2. Pen has typeOfPen like "Ink" or "Ball point"
            3. CD has type like "mp3", "planin rw"

   5.  ***Abstraction***
       1. <u>Abstract class</u>
          1. Hide the internal implementation. Provide a usuable feature.
          2. Abstract class is also called partially implemented class.
          3. We can't create object abstrct class.
          4. We can only inherit the abstrct class
          5. Ex: USB adapter
          6. Show essential features
          7. Ex:
             1. abstract class WhatsappCoreTeam{
             2. 
             3. void init(){
             4. // 10000 lines of code
             5. }
             6. abstract void send(); // abstract method
             7. String from;
             8. String to;
             9. 
             10. }
             11. class sendImage extends WhatsappCoreTeam{
                 1.  void send(){
                 2.  // 
                 3.  }
             12. }
   
       2. <u>Interface</u>
          1. 100% abstraction
          2. If all the methods of the class are abstract then we need to go for interface
          3. interface cannot be instantiated it can only be implemented.
          4. until java1.8 properties of the interface are public static final and methods are abstrct.
          5. What is interface?
             1. It doesn't have any implementation
             2. It has onlt declaration
             3. we cant inherit but we can implements
          6. When to use interface?
             1. If everything is abstract and change for each implementation class we need to go for interface
             2. If you want to define some rules
          7. Syntax:
             1. interface dialpad{
             2. void enterPin();
             3. }
             4. class onScreenDialPad implements dialPad{
                1. void enterPin(){
                2. }
             5. }
             6. class harwareDialPad implements dialPad{
                1. void enterPin(){
                2. }
             7. }
   
   
    6. ***Polymorphism***
       1. Poly means many
       2. Object oriented programming allows to use the same method name for different number of args or different number of parameters.
       3. 1. Runtime polymorphism
       4. 2. Compile time polymorphism
       5. Ex: 
          1. class Shape{
             1. int area(int length,int breath){
                1. // System.out.println("Area of rectange");
                2. return leangth*breath;
             2. }
             3. 1. int area(int length,int breath){
                 1. // System.out.println("Area of triange");
                1. return leangth*breath/2;
             4. }
             5. 1. int area(int length){
                 1. // System.out.println("Area of triange");
                1. return leangth*length
             6. }
          2. }
