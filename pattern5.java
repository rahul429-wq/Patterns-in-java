public class pattern5 {
    public static void main(String[] args) {

        int row=4;
        int col=4;

        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=col ; j++) {

                System.out.print(i*j+" ");

            }
            System.out.println("");

        }
    }
}
