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
        if(avg>=7){
            System.out.println("Your average score is 3"+ avg+", Good job!");
        }
        else if(avg>=4 && avg<=6){
            System.out.println("Your average score is "+ avg+" You need to work harder!");

        }
        else if(avg < 4){
            System.out.println("Your average score is "+ avg+" Failed, you really need to work harder!");
        }




    }
}
