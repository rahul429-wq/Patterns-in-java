//4
//3 4
//2 3 4
//1 2 3 4
public class pattern13 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j = i; j >=1 ; j--) {
                System.out.print(5-j);
            }
            System.out.println("");
        }
    }
}
