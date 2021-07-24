
//1
//2 1
//3 2 1
//4 3 2 1

public class pattern11 {
    public static void main(String[] args) {
        int row=4,col=4;int k=1;
        for (int i = 1; i <=row; i++) {
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}


