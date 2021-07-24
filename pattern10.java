
//1
//2 3
//4 5 6
//7 8 9 10

public class pattern10 {
    public static void main(String[] args) {
        int row=4,col=4;int k=1;
        for (int i = 1; i <=row; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
        System.out.println("");
        }
    }
}


