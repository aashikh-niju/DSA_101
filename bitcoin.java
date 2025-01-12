import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int bitcoin_value,bitcoin_increase, bitcoin_increase_value,total_bitcoin_value ;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the bitcoin value:");
        bitcoin_value=s.nextInt();
        System.out.println("enter the bitcoin increase:");
        bitcoin_increase=s.nextInt();
        bitcoin_increase_value= bitcoin_value*bitcoin_increase/100;
        total_bitcoin_value=bitcoin_value+bitcoin_increase_value;
        System.out.println("total_bitcoin_value: "+total_bitcoin_value);
        System.out.println("bitcoin_increase_value:"+bitcoin_increase_value);



    }
}
