// public class JavaBasics{
//     public static void main (String args[])
//     {
//         System.out.print("hello world");
//     }
// }

// # how to take input in java
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner dot=new Scanner(System.in);
//         String input=dot.next();
//         System.out.println(input);
//     }
// }


// #sum of two numbers
// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner add=new Scanner(System.in);
//         int a=add.nextInt();
//         int b=add.nextInt();
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }


// # sum of two numbers by using floats
// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner add=new Scanner(System.in);
//         float a=add.nextFloat();
//         float b=add.nextFloat();
//         float sum=a+b;
//         System.out.println(sum);
//     }
// }
   



// # product of a and b


// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner pro=new Scanner (System.in);
//         float a=pro.nextFloat();
//         float b=pro.nextFloat();
//         float product=a*b;
//         System.out.println(product);
//     }
// }

    
// # area of circle
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner circle=new Scanner(System.in);
//         float r=circle.nextFloat();
//         float area= 3.14f*r*r;
//         System.out.println(area);
//     }
// }



// # type promotion
    
// import java.util.*;
// public class JavaBasics{
//     public static void main (String arg[]){
//         char a='a';
//         char b='b';
//         System.out.println(b-a);
//     }
// }

// #normally exammples

// import java.util.*;/**
//  * JavaBasics
//  */
// public class JavaBasics {
//     public static void main(String args[]){
//         byte b=5;
//         byte a=(byte)(b*2);
//         System.out.println(a);
//     }

    
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner sum= new Scanner(System.in);
        
//         int a=sum.nextInt();
//         int b=sum.nextInt();
//         int c=sum.nextInt();
        
//         float average=sum.nextFloat();
//         average=(a+b+c)/3;
       
//         System.out.println(average);

//     }
// }


// #if else

// import java.util.*;
// public class JavaBasics{
//    public static void main(String arg[]){
//     int age=17;
//     if(age>18){
//         System.out.println("vote:drive:sex");
//     }
//     if (age>16 && age<18){
//         System.out.println("teeneger");
//     }
//     else{
//         System.out.println("baacha ");
//     }


//    }
// }


// # ternary operator
// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         String type=(5%2==0)? "even":"odd";
//         System.out.println(type);
//     }
// }


// # pass or fail calculator
// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner M=new Scanner(System.in);
//         int marks=M.nextInt();
//         if (marks>33){
//             System.out.println("pass");
//         }
//         else{
//             System.out.println("fail");
//         }
//     }

// }




// pattern

// import java.util.*;
// public class JavaBasics{

//     public static void main(String arg[]){
//         int n=4;
//         for(int line=1;line<=n;line++){
//             for(int number=1;number<=line;number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }



// # to swapping the number by use of function 
// import java.util.*;
// public class JavaBasics{
//     public static void swip(int a,int b){
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String arg[]){
//         int a=5;
//         int b=6;
//         swip(a,b);
//     }
    
    


// // }


// # swippping the number in another case but the number will not swipped
// import java.util.*;/**
//  * JavaBasics
//  */
// public class JavaBasics {
//     public static void swip(int a,int b){
//         int temp=a;
//         a=b;
//         b=temp;
//     }
//     public static void main(String arg[]){
//         int a=5;
//         int b=6;
//         swip(a,b);
//         System.out.println(a);
//         System.out.println(b);

//     }

    
// }
// # product of two number using fuction
// import java.util.*;
// public class JavaBasics{
//     public static void multiply(int a,int b){
//         int c=a*b;
//         System.out.println(c);
//     }
//     public static void main(String arg[]){
//         int a=5653;
//         int b=5647;
//         int c;
//         multiply(a,b);
       

//     }

// }
 


// # make a function on factorial of n
// import java.util.*;
 
// public class JavaBasics {
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//             System.out.println(f);
//             return f;

//         }

//         public static  void main(String arg[]){
//             System.out.println(factorial(7));
    
            
//         }


//     }

    
// }





    

