// class Calculator{

//     public int add(int num1,int num2){
//         System.out.print ("Addition is:");
//         return num1+num2;
//     }
// }


class Computer{
    public void playMusic(){
        System.out.println("music is playing");
    }

    public String getMePen(int cost){
        if(cost>10){
            return "pen";
        }
        else {
            return "nothing";
        }
    }
}
public class Methods {
    // public static void main(String[] args) {
    //     int num1=3, num2=5;

    //     Calculator calc= new Calculator();
    //     System.out.println(calc.add(num1,num2));
    // }

    public static void main(String[] args) {
        int cost=34;
        Computer comp= new Computer();
        comp.playMusic();
        System.out.println(comp.getMePen(cost));
    }
    
}
