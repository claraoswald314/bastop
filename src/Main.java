import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = input.nextInt();;
        int kalan;
        int sonuc = 0;
        while(sayi!=0){
            kalan=sayi%10;
            sonuc+=kalan;
            sayi/=10;
        }
        System.out.println("Sayının basamak rakamları toplamı : "+sonuc);

    }
}
