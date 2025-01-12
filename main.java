import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,n;


        System.out.println("hello world!");
        System.out.println("printing even numbers and odd numbers .......");
        System.out.println("enter the limit");
        n=s.nextInt();


        for(i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i+"= even number");

            }
            else
                System.out.println(i+"= odd number");

        }

    }
}
