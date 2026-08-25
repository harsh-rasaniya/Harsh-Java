import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int  n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int a = j+'A';      // we can also use j+65
                char ch = (char) a;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}