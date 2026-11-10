import java.util.Scanner;

public class Biggestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a,b,c;
         a=sc.nextInt() ;
         b=sc.nextInt() ;
         c=sc.nextInt() ;
         
        if (a>b&&a>c){
            System.out.println("A is big");

        }
        else if (a<b&&a<c){
            System.out.println("A is small");

        }
        if (b>a&&b>c){
            System.out.println("B is big");


        }
        else if (b<a&&b<c){
            System.out.println("B is small");
        }
    
    

        if (c>b&&c>a){
            System.out.println("C is big");
    
        }
        else if (c<b&&c<a){
            System.out.println("C is small");
    
        }

    }
}

