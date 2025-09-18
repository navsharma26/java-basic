
 public class arraynw {
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[0]=marks[0]+1;
//         }

//     }
//     public static void main(String args[]){
//         int marks[]={96,97,98};
//         update(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[1]+" ");
//         }
//         System.out.println();
//     }
    
        // 


        public static void main(String[]args){
            int[][]arr={
                {1,2,3}
                ,{4,5,6}
                ,{7,8,9}};
                for(int row=0;row<arr.length;row++){
                    for(int col=0;col<arr[row].length;col++){
                        System.out.println(arr[row][col] +" ");
                    }
                    System.out.println();
                }
              
        }
}
