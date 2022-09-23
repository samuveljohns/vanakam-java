Java Installation:
1. Download jdk from internet or oracle website.

Purpose of Java program?
1. Do write a prime program?
2. Do find odd or even number?
3. Do print the number series?
4. To add two numbers?
5. Main purpose of the Java program:
   1. OOPS
   2. Multi threaded programming
   3. It is secure
   4. Platform independant

Object oriented thining:
1. Monitor is device, It is an object
2. It has some size
3. It has some resolutionSupported
4. It has prize
5. It has some technologyType
6. Purpose
   1. To display the connect laptop
   2. To display Cable TV programs
   3. To support as secondary monitoring device.

monitor1
    size is 15inch
monitor2
    size is 13inch
monitor3
    size is 50inch

Assignment:

1. Write a simple Java program for BankAccount
 1. Characteristics of the BankAccount
    1. Account number
    2. Account holder name
    3. Bank name
    4. branch name
    5. balance
2. Purpose / action of the bank account
   1. toGetTheBalance() // Balance
   2. toWithdrawMoney()  // Print as withdraw money
3. I wanted to store 3 bank account information
   1. Sam, 11111, 1000, Townhall, ICICI
   2. Ram, 22222, 5000, Townhall, ICICI


How to write a Java program?
1. Create a file with extension of Demo.java

void main(){
    //....
}
class Demo{
    

}

1. Variables:
   1. In a program, If we wanted to store any value like int, char, float. we will be storing in the form of Variable
   2. What is the syntax
      1. int pin = 1000; // Primitive variable
      2. Monitor m1 = new Monitor();
      3. m1 is also called Object or variable (Referenced variable)
   3. Types of Variables
      1. Instance variable
      2. Class variable
      3. Local variable
   4. How are we defining the variable types?
      1. Based on the variable present inside the java program. we can categorize into the 3 types.
    5. Instance variable
       1. When the value of the variable differs for each object it is called instance variable or object variable.
       2. Instance variable should be inside the class but it should not be inside the constructor, method, and block {}.
    6. Class variable
       1. Class variable is also called static variable.
       2. static <datatype> = <value>
       3. We can't access static variable with object.variablename.
    7. Local variable
       1. If any variable declared inside the method or constructor or block is called local variable
   

Assignment2:
1. Create class for
   1. Student s1 = new Student("Sam",00001,"ECE");
   2.  Student s1 = new Student("Ram",00001,"EEE");
   3. Store the college name as class variable