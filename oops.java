
public class oops{
    public static class person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name + "[" + age + "]" + "says hi");
        }
    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.age = 10;
        p1.name = "a";
        // p1.saysHi();
       

        person p2 = new person();
        p2.age = 20;
        p2.name = "b";
        // p2.saysHi();

        // person p3 = p2;
        // // p3.age = 30;
        // p3.saysHi();
        p1.saysHi();
        p2.saysHi();

        swap1(p1, p2);
        p1.saysHi();
        p2.saysHi();

    }
    public static void swap1(person psn1, person psn2){
        psn1 = new person();
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;
        
        psn2 = new person();
        String name = psn1.name;
        psn1.name =psn2.name;
        psn2.name= name;
    }
 }