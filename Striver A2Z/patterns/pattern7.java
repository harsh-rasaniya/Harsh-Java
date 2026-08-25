import java.util.Scanner;
public class pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++ ){
            for(int j=0 ; j<n-i-1 ;j++){
                System.out.print(" ");
            }
            for(int j=0 ; j< (2*i)+1 ; j++){
                System.out.print("*");
            }
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
        
        
        
        // for(int i=n ; i>=0 ; i=i-2){
        //     for(int j=0 ; j<=n ; j++){
        //         if(j < (i/2) || j >= ((n-(i/2))+1)) {
        //             System.out.print(" ");
        //         }
        //         else System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}