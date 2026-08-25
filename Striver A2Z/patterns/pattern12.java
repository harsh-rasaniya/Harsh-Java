import java.util.*;
public class pattern12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numebr : ");
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=2*n ; j++){
                if(j>i && j<((2*n)-i)+1) System.out.print(" ");
                else System.out.print(Math.min(j,((2*n)-j)+1));
            }
            System.out.println();
        }
    }
}