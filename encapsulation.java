class privata{
    private String name;
    private int age;

    public void setage(int age){
        this.age=age;
    }
    public void setname(String name){
        this.name=name;
    }

    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }

}
public class encapsulation {
    public static void main(String[] args) {
     privata obj=new privata();
     obj.setage(24);
     obj.setname("yash");

     System.out.println(obj.getage());
     System.out.println(obj.getname());

    //  int Age=obj.getage();
    //  System.out.println(Age);
    //  String Name=obj.getname();
    //  System.out.println(Name);


    // System.out.println(obj.getage(24));
    // System.out.println(obj.getname("yash"));

    }
    
}
