// public class pattern {
//     public static void hollow_pattern(int r,int c){
//         // # for outer loop it goes to all lines
//         for(int i=1;i<=r;i++){
//         //     # for inner loop 
//         for (int j =1;j<=c;j++){
//             if(i==1||i==r||j==1||j==c){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }

//         }
//         System.out.println();


//         }

//     }
//     public static void main(String arg[]){
//         hollow_pattern(12,15);
//     }
    
// }

// #for inverted star conditiom
// public class pattern{
//     public static void inverted(int n){
//         for(int i=1;i<=n;<i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print("*")
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String arg[]){
//         inverted(6);
//     }
// }
//  # for  inverted number type
 public class pattern{
    public static void num_inverted( int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        num_inverted(6);
    }
 }