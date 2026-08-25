import java.util.Scanner;
class pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // for(int j=0;j<n-i;j++){
            //     int num = j+65;
            //     // char ch = (char) num;
                    // OR
            //     System.out.print((char) num +" ");
            // }

            // OR
            // More easy but tricky to get
            for(char ch = 'A' ; ch < 'A'+(n-i) ; ch++){
                System.out.print(ch +" ");
            }

            System.out.println();
        }
    }
}