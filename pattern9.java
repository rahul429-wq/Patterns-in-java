public class pattern9 {
    public static void main(String[] args) {
        int row=4,col=4;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print((i*j)+" ");

            }
            System.out.println("");

        }
    }
}
