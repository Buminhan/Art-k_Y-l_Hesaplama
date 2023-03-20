import java.util.Scanner;
public class Artik_Yil {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        if(yil%4==0 && yil%100!=0){
            System.out.println(yil +" artık yıldır.");
        }
        else if(yil%400==0){
            System.out.println(yil+" artık yıldır.");
        }
        else{
            System.out.println(yil+" artık yıl değildir.");
        }
    }
}
