import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil =0;

        Scanner input= new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil=input.nextInt();


        if(yil % 4 ==0){
            if (yil % 400 ==0){
                System.out.println(yil+" Bir Artık Yıldır !");
            }else if(yil %100==0){
                System.out.println(yil+" Bir artık yıl değildir !");
            }else {
                System.out.println(yil+" Bir artık Yıldır !");
            }
        }else {
            System.out.println(yil+" Bir artık yıl değildir !");
        }
    }
}
