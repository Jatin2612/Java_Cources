// Abstract class and methods

// abstract class car {
//     public abstract void drive();

//     public void playmusic() {
//         System.out.println("Playing music");
//     }
    
// }
// class BMW extends car {

//     public void drive() {
//         System.out.println("Driving BMW");
//     }
// }
// public class Abstract {
//     public static void main(String[] args) {

//         car obj = new BMW();
//         obj.drive();
//         obj.playmusic();
//     }
// }

// Inner Class Anomys in class 

// class A {
//     int age;

//     public void show ()
//     {
//         System.out.println("in show");
//     }
//     class B {
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Abstract {
//     public static void main(String[] args) {
//         A obj = new A()
//         {
//             public void show()
//             {
//                 System.out.println("in show method");
//             }
//         };
//         obj.show();
        
//     }
// }

// @FunctionalInterface
// interface A 
// {
//     void show ();
// }

// public class Abstract {
//     public static void main(String[] args) {
//         A obj = ()->
//         {
//             System.out.println("in show method");
//         };
//         obj.show();
        
//     }
// }

public class Abstract 
{
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        try {
            j = 18/i;
            if(j==0)
                throw new NullPointerException("j is zero");
        }
        catch (ArithmeticException e) {
            System.out.println("that the defualt output" + e);
        }
        catch (Exception e) {
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);

    }
}