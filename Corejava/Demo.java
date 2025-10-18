// class Calculator
// {
//     int a;
//     public int add(int n1,int n2) 
//     {
//         int r = n1 + n2;
//         return r;    
//     }
// }
// public class Demo
// {
//     public static void main(String[] args) 
//     {
//         int num1 = 4;
//         int num2 = 8;
        
//         Calculator calc = new Calculator();
//         int result = calc.add(num1,num2);

//         System.out.println(result);
//     }
// }


class Human
{
    private int age;
    private String name;

    public Human()
    {
        age = 12;
        name = "John";
    }


        public Human(int a, String n )
        {
                age = a;
                name = n;
        }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

     class Demo
     {
        public static void main(String[] args) 
        {
           Human obj = new Human();
           Human obj1 = new human(a = 18,  n ="Navin");

        //    obj.setAge(30);
        //    obj.setName("jatin");
            System.out.println(obj.getName() + ":" + obj.getAge());   
            System.out.println(obj1.getName() + ":" + obj1.getAge()); 
        }
     }