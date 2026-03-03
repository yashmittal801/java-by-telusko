class  mobile{
    String name;
    int price;
    static String type;

    public mobile(){
        name="yash";
        price=200;
        System.out.println("constructor");

    }
    static{
        type="mobile phone";
        System.out.println("static block");
    }
    
    void print(){
        System.out.println(name+" , "+price+" , "+type);
    }
}
public class Statics {
    public static void main(String[] args) {
        mobile mb1=new mobile();
        mb1.name="Samsung";
        mb1.price=10000;
        mobile.type="Smart Phone";
        
        mobile mb2=new mobile();
        mb2.name="oppo";
        mb2.price = 3000;
        mobile.type="wired phone";


        mb1.print();
        mb2.print();

        System.out.println("");

        mobile.type="phone";
        mb1.print();
        mb2.print();
    }

    
}
