import java.util.Scanner;


public class practice1 {
    // identify whether the STRING  is palindrome or not

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    String str=sc.nextLine();
    // now calling the function whenver it will be true , now if boolena str is true then it will return true
    if(isPalindrome(str)){
        System.out.println("it is a palindrome");
    }
     else{
        System.out.println("not a palindrome number");
    }
}

// here declaring the function;
    public static boolean isPalindrome(String str) {
        int i;
        int n =str.length();
        for(i=0;i<=(n/2);i++){
             if(str.charAt(i)!=str.charAt(n-1-i)){
                 return false;
        }
    }
    return true;


    
}
    
}
