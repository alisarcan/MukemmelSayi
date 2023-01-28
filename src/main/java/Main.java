import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,mukNumber,n,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();
        int i=1;
        while (i<number){
            if(number%i==0){
                toplam+=i;
            }


            i++;
        }
        if(toplam==number){
            System.out.println("Mükemmel Sayı");
        }else {
            System.out.println("Mükemmel Sayı Değil");
        }
    }
}
