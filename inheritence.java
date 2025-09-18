

// public class inheritence {
//     public static void main(String arg[]){
//         fish Shark=new fish();
//         Shark.eat();



//     }
    
// }
// class animal{
//     String color;
//     void eat(){
//         System.out.println("can eat");
//     }
//     void breadth(){
//         System.out.println("can breadth");
//     }

// }
// class fish extends animal{
//     int fins;
//     void swim(){
//         System.out.println("can swim");
//     }


// }



// # here is the example of mulltilevel inheritence

public class inhertence{
    public static void main(String arg[]){
        dog doggy =new dog();
        doggy.eat();

    }
    class animal{
        Sting color;
        void eat(){
            System.out.println("can eat");
        }
        void breadth(){
            system.out.println("can breadth");
        }
    }
    class memmal extends animal{
        int legs;
         

    }
    class dog extends memmal{
        String breed;
    }

}