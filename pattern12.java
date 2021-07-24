//4
//4 3
//4 3 2
//4 3 2 1

public class pattern12{
    public static void main(String[] args) {
        int row=4,col=4;int k=1;
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((col+1)-j+"   ");
            }
            System.out.println("");
        }
    }
}

