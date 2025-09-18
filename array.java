// import java.util.*;
// public class array {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int[]arr=new int[4];
//         // arr[0]=23;
//         // arr[1]=45;
//         // arr[2]=34;
//         // arr[3]=65;
//         // #internaly it is storing like this[23,45,34,65]
//         System.out.println(arr[]);
//         for (int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//     }
    
// }
// # taking inputs in array

// import java.util.*;
// public class array{
//     public static void main(String[] arg){
//         int marks[]=new int [3];
//         Scanner sc=new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         System.out.println("phy:"+marks[0]);
//         System.out.println("chy:"+marks[1]);
//         System.out.println("maths:"+marks[2]);

//     }
// }

//  # for 2d array
import java.util.*;
public class array{
    public static void main(String arg[]){
        int matric[][]=new int[3][3];
        int n=matric.length, m=matric[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matric[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(matric[i][j]);
            }
            System.out.println();
        }




    }
    

}
