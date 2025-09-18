public class Linearsearch{
    public static void main(String[] args) {
        int[] nums ={23,45,6,38,9};
        int target=6;
        int ans=Linersearch(nums,target);
        System.out.println(ans);
        
    }
   static int Linersearch(int[]arr,int target){
    if(arr.length==0){
        return -1;
    }
    for(int index=0;index<arr.length;index++){
        int element=arr[index];
        if(element==target){
            return index;
        }
    }
    return -1;

   }

    
}
