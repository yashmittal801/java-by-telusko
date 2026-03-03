class Human{
    private int age;
    private String name;

    public Human() {
        age=34;
        name="yash";


    }

    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
}
public class constructor {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1= new Human(18, "vansh");

        System.out.println(obj.getAge()+"  "+obj.getName());
        System.out.println(obj1.getAge()+"  "+obj1.getName());

    }
    
}
