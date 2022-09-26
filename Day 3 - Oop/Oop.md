Day 3:
1. Method
2. Constructor
   1. Special type of method
   2. It has same name as class name
   3. Various of types of constructor are there (default constructor, parameterized constructors)
   4. No need to mention return type
   5. What is the purpose of the constructor?
      1. It helps to initialize the values immediatly after object creation
   6. 
3. Oops
    1. Class
       1. It describes about class
       2. In java everything is a class
       3. We can't write a Java program without class keyword
       4. Syntax:
          1. class <classname>{
             1. ...
          2. }
   
    2. Object
       1. It is a behaviour of the class.
       2. Realtime entity
       3. Object is also called instance.
    Syntax:
        new <constructor>();
        Ex: Monitor m = new Monitor();
    1. Encapsulation
       1. Data hiding
       2. but it show allow the functionality
       3. Why? 
          1. To avoid unauthorized access
          2. Ex: Card number prints with xxxx
       4. What?
             1. What is data in the program
                1. The values we store in a variable is called "Data"
       5. How?
          1. Make a variable as private
          2. expose the value of the variable in public method;
    2. Inheritance
       1. Acquiring the properties of another class.
       Why?
       1. We can reuse the functionality.
       2. Less number of line of code.
       3. Better readability.
       4. If you change in one place it will be changed in derived class

        Person
            1. name
            2. age
            3. dob
            4. address
            5. phnumber
         1. Student
            
            1. rollno
            2. department
         2. Proffessor
          
            1. department
            2. qualification
         3. Driver
          
            6. busNumber
            7. busRouteNumber
    Assignment:
        1. Write a program in Java 
        2. to maintain different types of Goods
        3. Goods are like Book, CD, Pen
        4. Goods have common properties like name, price, isImportedOrNot, tax
        5. Each item has different properties like 
           1. Book has Softcopy version and hardcopy version
           2. Pen has typeOfPen like "Ink" or "Ball point"
           3. CD has type like "mp3", "planin rw"


    1. Abstraction
    2. Polymorphism
