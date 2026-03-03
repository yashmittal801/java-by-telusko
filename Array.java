public class Array {
    public static void main(String[] args) {
    //     int arr[]= new int[4];
    //     arr[0]=3;
    //     arr[1]=6;
    //     arr[2]=43;
    //     arr[3]=67;
    //     for(int i=0;i<4;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    int arr[][] =new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=(int)(Math.random()*10);
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+"     ");
        }
        System.out.println("");
    }
    }
}
