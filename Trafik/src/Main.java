import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hiz;
        System.out.println("Hiz sinirimiz 90km/s");

        System.out.print("Hizinizi giriniz : ");
        hiz = scan.nextInt();



        if (hiz>90 && hiz<110){
            System.out.println("Hiz sinirini astiniz");
            System.out.println("Ceza tutariniz : 1000 tl");

        }
        else if (hiz>=110 && hiz<130) {
            System.out.println("Hiz sinirini astiniz");
            System.out.println("Ceza tutariniz : 2000 tl");

        }
        else if (hiz<90 && hiz>0) {
            System.out.println("Hiziniz yeterli seviyede ");

        } else if (hiz>=130) {
            System.out.println("Ehlite el koyulacak");

        }
        else {

        }
        switch (hiz){

            case 90 :
                System.out.println("hiziniz kritik seviyede dikkatli olmalisiniz");
                break;

            case 0 :
                System.out.println("Hareket halinde degilsiniz");
                break;
            default:
        }
        System.out.println("----İyi Yolculuklar Dileriz----");


    }
}