import java.util.Scanner;
public class pattern10{
    public static void halfDiamond(int n){
        rightTri(n);
        invertedRightTri(n);
    }
    public static void rightTri(int n){
        for(int i = 0 ; i < n ; i++ ){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedRightTri(int n){
        for(int i=n-1 ; i>=0 ; i--){
            for(int j=0 ; j<i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        halfDiamond(n);
        
    }
}