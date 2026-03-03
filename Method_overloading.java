class Calculator{
    public int add(int a,int b){
        return a+b;

    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double c){
        return a+c;
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        int a=5,b=4,c=6;
        Calculator  calc= new Calculator();
        int result1=calc.add( a, b);
        int result2=calc.add(a,b,c);
        double result3=calc.add(a,c);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    
}
