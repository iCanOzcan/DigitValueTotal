import java.util.Scanner;
public class DigitValeTotal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int number = input.nextInt();
        int basValue;
        int result = 0;
        int tempNumber=number;

        while(tempNumber !=0){
            basValue=tempNumber%10;
            System.out.println(basValue);
            result +=basValue;
            tempNumber/=10;
        }
        System.out.println(number + " sayisinin basamaklari toplami :"+result);
    }
}
