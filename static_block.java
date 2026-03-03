class mobile{
    String name;
    int price ;
    static String brand;
    public void print(){
        System.out.println(name+" ; "+price+" ; "+brand);
    }
    public static void show1(mobile var1){
        System.out.println(var1.name+" ; "+var1.price+" ; "+brand);
    }

}
public class static_block {
    public static void main(String[] args) {
        mobile var1=new mobile();
        var1.name = "Samsung"; 
        var1.price = 10000;
        mobile.brand = "Smart Phone";

        var1.print();
        System.out.println(" ");

        mobile.show1(var1);

    }
    
}
