//1 1 1 1
//2 2 2
//3 3
//4

public class pattern15{
    public static void main(String[] args) {
        for (int i = 4; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((5-i)+" ");
            }
            System.out.println("");
        }
    }
}
