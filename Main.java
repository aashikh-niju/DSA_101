import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int a,b,c,avg;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the grades out of 10");
        System.out.println("enter the grade of geometry:");
        a=s.nextInt();
        System.out.println("enter the grade of algebra:");
        b=s.nextInt();
        System.out.println("enter the grade of physics:");
        c=s.nextInt();
        avg=(a+b+c)/3;
        System.out.println("average of three subjects is:"+avg);


    }
}