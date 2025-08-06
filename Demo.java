
import java.util.Scanner;   


// This code demonstrates method overloading in Java.
// Method overloading allows multiple methods with the same name to exist in a class,

// public class Demo{
//     public static int sum(int a, int b) {
//         return a + b;
//     }
//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }
//     public static double sum(double  a, double b) {
//         return a + b;
//     }
// }
    
// class codes{
//     public static void main(String[] args) {
       
//         Demo cod = new Demo();
//         int result1 = cod.sum(5, 8);
//         int result2 = cod.sum(10, 5, 7);
//         double result3 = cod.sum(5.5, 8.2);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//     }
    
// }


// This code demonstrates method overloading in Java.
// The `sum` method is overloaded to handle different numbers of parameters and types.
// The first method takes two integers, the second takes three integers, and the third takes two doubles.
// The main method tests these overloaded methods and prints the results to the console.
// The output will be:
// 13
// 22
// 13.7
// This shows how Java allows methods with the same name to coexist as long as their parameter lists

 
// public class Demo{
//     public static void main(String[] args) {
//         int age;
//         //int result=0;
//         System.out.println("Enter your age: ");
//         Scanner sc = new Scanner(System.in);
//         age= sc.nextInt();
//         switch(age){
//             case 18:      
//                 System.out.println("U can vote");
                
//                 break;
//             case 60:
                
//                 System.out.println("U r getting Retirement");
//                 break;
//             case 80 :
                
//                 System.out.println(" Take Bed rest");
//                 break; 
//             default:
//                 System.out.println("Error, plese enter valid age");
//                 break;
//         }     
//     }
// }





// public class Demo {
//     public static void main(String[] args) {
//         String name = new String("kunal");
//         System.out.println("Hello " + name);
//         System.out.println(name.length());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.charAt(1));

//     }
// }
 //////////////////////          ///////
// class kp 

// {
//     static String name ;
//     String brand;
//     int price;
//     public void jp()
//     {
//         System.out.println(name);
//         System.out.println(brand);
//         System.out.println(price);
//     }
    
// }
// public class Demo 
// {
//     public static void main(String[] args) 
//     {
//        kp str = new kp();
//        //str.name = "smartphone";
//        str.brand = "apple";
//        str.price = 50000;
       
//        kp str1 = new kp();
//        //str1.name = "smartphone";
//        str1.brand = "Moto";
//        str1.price = 20000;
       
//        kp str2 = new kp();
//        str2.name = "smartphone";
//        str2.brand = "lenvo";
//        str2.price = 10000;
       
//        str.jp();
//        str1.jp();
//        str2.jp();
//     }
// }



//Example of static and instance variables in Java
//Static variables are shared among all instances of a class, while instance variables are unique to each instance.
//Static variables can be accessed using the class name or an object reference, while instance variables can only be accessed through an object reference.
//If a static variable is modified, the change is reflected across all instances of the class, while modifying an instance variable only affects that specific instance.
//This example demonstrates the difference between static and instance variables in Java, showing how they behave when modified and accessed through different

/* 

class Calc{
    static int stA=100; //independent of object // we can use this by class name as well as object
    int  inB = 100;  //dependent of object //we can only use this by object

    public static void main(String []args){
    
        Calc obj1=new Calc(); 
        Calc obj2=new Calc();
//for static variable
        System.out.println(Calc.stA); //use with class name
        System.out.println(obj1.stA);  //use by object name

//for instance variable
//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
        System.out.println(obj1.inB); //used by object name reference 


// = if we can change value static or instance what happen 
        obj1.inB=1000;
        obj1.stA=2000;

//static 
        System.out.println(obj1.stA);//output: 2000
        System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 
//it also show that static variable independent of objects

//instance 
        System.out.println(obj1.inB); // output: 1000
        System.out.println(obj2.inB); // output: 100 no change in obj2
    }
}

*/

// This code demonstrates how static and instance variables work in Java.
// Static variables are shared across all instances of a class, while instance variables are unique to each instance.
// The example shows how modifying a static variable affects all instances, while modifying an instance variable only
// affects the specific instance it belongs to.
// The output will show the values of both static and instance variables before and after modification.
/* 
class add{
    public static void sum(int a, int b) {
        int Add = a + b;
        System.out.println(Add);
    }
}

class Demo {
    public static void main(String[] args) {
        add.sum(8,9);
    }
}

*/
// This code demonstrates a simple addition operation using a static method.
// The `sum` method in the `add` class takes two integers, adds them,
// and prints the result to the console.
/* 
public class Demo {
    int y;

    // Non-static block
    {
        y = 20;
        System.out.println("Non-static block executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();  // Block + Constructor
        Demo d2 = new Demo();  // Block + Constructor again
    }
}
*/

// Encapsulation in Java is a fundamental concept that restricts direct access to an object's data and methods.
// It allows for controlled access through public methods, ensuring data integrity and security.
// In this example, the `kp` class encapsulates the `age` and `name` attributes,
// providing public methods to access them through the inner class `jp`.
// The `Demo` class demonstrates how to create an instance of the outer class and access the inner class to retrieve the encapsulated data.
// The output will display the age and name of the person encapsulated within the `kp` class.
// This approach promotes better organization and encapsulation of data in
// class kp{
//     private int age=10;
//     private String name="kunalllll";
    
    
//     class jp{
//         int getAge() {
//             return age;
//         }
//         String getName() {
//             return name;
//         }
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         kp obj = new kp();
//         kp.jp innerObj = obj.new jp();
        
//         System.out.println(innerObj.getAge());
//         System.out.println(innerObj.getName());
//     }
// }

// class a{
//     void show(){
//         System.out.println(this);
//     }
//     public static void main(String[]args){
//         a obj = new a();
//         obj.show(); // This will print the reference of the current object
//         System.out.println(obj); // This will also print the reference of the current object
//     }
// }

// class Human{
//     public int age;
//     public String name;
//     public Human() {
//         age = 25; 
//         name = "John Doe"; 
//         System.out.println("age "+ age + ", name " + name                                                                                        );
//     }

// }
// class Demo {
//     public static void main(String[] args) {
//         Human person = new Human();
//         Human person1 = new Human();
//         Human person2 = new Human();
//         System.out.println("Age: " + person.age + ", Name: " + person.name);
        
//     }
// }


// super का Use क्यों किया जाता है?
// Parent class के variable को access करने के लिए, जब subclass में same नाम का variable हो।

// Parent class के method को call करने के लिए, जब subclass में same नाम का method हो।

// Parent class के constructor को call करने के लिए, subclass के constructor से।

// class Animal {
//     Animal() {
//         System.out.println("Animal constructor called");
//     }
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
//     String color = "White";// variable of parent class
// }

// class Dog extends Animal {
//     Dog() {
//         super(); // Must be first statement
//         System.out.println("Dog constructor called");
//     }
//     String color = "Black";
//     void sound() {
//         System.out.println("Dog barks");
//     }

//     void printColor() {
//         System.out.println(color);         // Black
//         System.out.println(super.color);   // White
//     }
//     void show() {
//         sound();         // Dog barks
//         super.sound();   // Animal makes sound
//     }

// }

// public class Demo {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.printColor();
//         d.show();
//         //d.sound(); // Dog barks
//         // Animal a = new Animal();
//         // a.sound(); // Animal makes sound
//         // System.out.println(a.color); // White
//         // Animal b = new Dog();
//         // b.sound(); // Dog barks
//         // System.out.println(b.color); // White, because b is of type Animal, so it
//     }
// }



// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//         super.sound();
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Animal a = new Dog(); // Upcasting
//         a.sound();
//                     // Calls Dog's overridden method
//     }
// }

// import java.util.Scanner;

// // This code demonstrates how to read user input in Java using the Scanner class.

// public class Demo {
//     public static void main(String[] args) {
//     Double radius;
//     System.out.println("Enter the radius: ");
//     Scanner scanner = new Scanner(System.in);
//     radius = scanner.nextDouble();
//     double area = Math.PI * radius * radius;
//     System.out.println("Area of the circle: " + area);
//     }
// }


// class Student {
//     String name;
//     int age;

//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Student{name='" + name + "', age=" + age + "}";
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Student s1 = new Student("Kunal", 23);
//         System.out.println(s1);            // Auto calls toString()
//         System.out.println(s1.toString()); // Same output
//     }
// }


//boxing and unboxing in Java

// Boxing is the process of converting a primitive type into its corresponding wrapper class object.
// Unboxing is the reverse process, where a wrapper class object is converted back to its primitive type.
// In Java, this is done automatically by the compiler when you assign a primitive value to a wrapper class object or vice versa.
// Here's an example of boxing and unboxing in Java:

// class demo{
//     public static void main(String[] args) {
//         int x = 5;
//         Integer obj = Integer.valueOf(x); // boxing
//     }
// }


// Abstract class
// absrtact class is a class that cannot be instantiated and can contain abstract methods (without body) as well as concrete methods (with body).
// Abstract classes are used to provide a base for subclasses to extend and implement the abstract methods.
// An abstract class can have both abstract and concrete methods, and it can also have instance variables
// and constructors.
// To create an abstract class, use the `abstract` keyword before the class declaration.
// To create an abstract method, use the `abstract` keyword before the method declaration.
// Subclasses must implement all abstract methods of the abstract class, or they must also be declared as abstract.
// If a subclass does not implement all abstract methods, it must also be declared as abstract
// and cannot be instantiated.
// Here's an example of an abstract class and a concrete subclass that implements the abstract method:
// abstract class Animal {

//     // Abstract method (no body)
//     abstract void sound();

//     // Concrete method
//     void sleep() {
//         System.out.println("Animal sleeps");
//     }
// }

// // Concrete subclass
// class Dog extends Animal {

//     // Overriding abstract method
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// // Main class
// public class Demo {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();  // Output: Dog barks
//         d.sleep();  // Output: Animal sleeps
//     }
// }

// Anonymous class in Java is a way to create a class without giving it a name.
// It is used to instantiate a class that may not be reused elsewhere in the code.
// Anonymous classes can be used to extend a class or implement an interface.
// They are often used for event handling, callbacks, or when you need a one-time use

// class mother{
//     void show(){
//         System.out.println("Mother's show method");
//     }
// }
// class demo{
//     public static void main(String[] args) {
//         mother m = new mother(){
//             @Override
//             void show() {
//                 System.out.println("Overridden show method in demo class");
//             }
//         };
//         m.show(); // Calls the overridden show method in the demo class
//     }
// }


// abstract class name{
//     public abstract void show();
//     public abstract void show2();
    

// }
// class Demo{
//     public static void main(String [] args) {
//         name obj = new name(){
            
//             public void show() {
//                 System.out.println("Anonymous class implementation of show method");
//             }
//             public void show2() {
//                 System.out.println("Anonymous class implementation of show method2");
//             }
//         };
//         obj.show(); // Calls the overridden show method in the anonymous class
//         obj.show2(); // This will cause an error because show2 is not part of the abstract class
    
//     }

// }

// interface Shape {
//     double area();
// }

// class Circle implements Shape {
//     double radius;

//     Circle(double r) {
//         radius = r;
//     }

//     public double area() {
//         return 3.14 * radius * radius;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Shape s = new Circle(2);
//         System.out.println("Area: " + s.area());
//     }
// }

// interface A {
//     int age = 10;
//     void show();
// }

// interface B {
//     void display();
// }
// interface ccc extends B {
//     // Interface C extends B
//     // You cannot have statements like System.out.println in an interface body.
//     void cMethod();
// }


// class C implements A, ccc {
//     public void show() {
//         System.out.println("Show from " + age  );
//     }

//     public void display() {
//         System.out.println("Display from B");
//     }
//     public void cMethod(){
//         System.out.println("C method from interface C");
//     }
//  }
// class Demo {
//     public static void main(String[] args) {
//         A obj;
//         obj = new C();
//         obj.show();
//               // Calls show from A
//         // obj.display();   // Calls display from B
//         // obj.cMethod();   // Calls cMethod from interface C
//         //ccc obj2 = new ccc();
//         B obj2 = new C();

//         obj2.display();  // Calls display from B

//         ccc obj3 = new C();

//         obj3.cMethod();  // Calls cMethod from interface C
//         obj3.display();
//     }
// }


// import java.util.Scanner;
// public class Demo{
//     int y;	
//     int x;	
//     int c;
//         public void compareValues() {
    
// 	        if(x>y) {

// 	        c = x+y;
// 	        System.out.println(c);
// 	    }
// 	    else {
// 	        c = x-y;
// 	        System.out.println(c+ " in equation x is greater then y");
// 	    }
//     }


//     public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
//         Demo d = new Demo();
// 	    d.y = sc.nextInt();
// 	    d.x = sc.nextInt();
// 	    d.compareValues();
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         int i;
//         for(i=1; i<=5; i++){
//             System.out.println("Hello World " + i);
//         }
//         System.out.println(i); // This will print 6 because the loop increments i to 6 after the last iteration
//     }

// }

// print 19 table reverse order from 190 to 19
// class Demo{
//      public static void main(String[] args) {
//         for(int a=190; a>=19; a-=19){
//             //if(a%19==0)
//             System.out.println(a);
            
//         }

//      }
// }

//table of any number input by user.
// class Demo{
//     public static void main(String[]args){
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i=1; i<=10; i++){
//             System.out.println(num + " * " + i + " = " + i*num);
//         } 
//     }
// }

//  class Demo{
//     public static void main(String[]args){
//        int x=4, y=0;
//         while(x>=0){
//             x--;
//             y++;
//             if(x==y)
//                 continue; // Skip the rest of the loop when x equals y
//             else
//                 System.out.println( x + " " + y);   
//     }
//  }


// class Demo{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = sc.nextInt();
//         if(num1<=9){
//             System.out.println("Single digit number");
//         }else if(num1<=99){
//             System.out.println("Double digit number");
//         }else if(num1<=999){
//             System.out.println("Triple digit number");
//         }else if(num1<=9999){
//             System.out.println("Four digit number");
//         }else{
//             System.out.println("Number is greater than four digits");
//         }                
//     }
//  }

// class Demo{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = sc.nextInt();
//         int count = 0;
//         while(num1!=0){
//             num1/=10;
//             count++;
//         }
//         System.out.println("Number of digits: " + count);
//     }
// }

// class Demo{
// 	public static void main(String args[]) {
// 		Scanner sc = new Scanner(System.in);
//         System.out.println(
//             "Enter a number to find the sum of its digits: "
//         );
// 		int num = sc.nextInt();
// 		int sum = 0;
// 		while(num != 0) {
//             int lastDigit = num % 10; // Get the last digit
//             sum += lastDigit; // Add it to the sum
//             num /= 10; // Remove the last digit from the number                       
//         }
// 		System.out.println(sum);	
// 	}
// }


//import java.util.Scanner;
// class Demo {
//     public static void main(String args[]) {
// 	    Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : i  ");
// 	    int ii = sc.nextInt();
//         String name= sc.next();
//         System.out.println("Enter a number : j  "+ name);
//         //  int jj = sc.nextInt();
//         // int num = sc.nextInt();
//         // int product=1;
//         // while(num>=1){
//         //     int lastdigit = num%10;
//         //     if(lastdigit>=1){
//         //         product*=lastdigit;
//         //     }else{
//         //         continue;
//         //     }
//         // num/=10;           
//         // }

// 		// System.out.println(product);
//         // System.out.println("The product of the digits is: " );

//         //------------------------------------
//         // for(int i =1; i <= ii; i++) {
//         //     for (int j = 1; j <= jj; j--) {
//         //         System.out.print("* "); // Print the product in a tabular format
//         //     }
//         //     System.out.println(); // Move to the next line after each row
//         // }
// 	}
// }


// class Demo{
//     public static void main(String[] args) {   

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int value=1;
//         for(int i =1; i<=num;i++){
//             value*=i;
            
//         }
//         System.out.print(value + " "); // Print the product in a tabular format

//     }
        
// }
class Demo{
    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int value = 0;
        while( num!=0) {
            value = num%10; // Get the last digit
            value=num;
            
             
    }
}