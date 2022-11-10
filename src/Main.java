import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        double armut,elma,domates,muz,patlican,tutar;

        System.out.print("Kaç kilo armut? ");
        armut=inp.nextDouble();

        System.out.print("Kaç kilo elma? ");
        elma=inp.nextDouble();

        System.out.print("Kaç kilo domates? ");
        domates=inp.nextDouble();

        System.out.print("Kaç kilo muz? ");
        muz=inp.nextDouble();

        System.out.print("Kaç kilo patlıcan? ");
        patlican=inp.nextDouble();

        tutar= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5); // Alınan kilogramlara göre toplam tutar 
        System.out.println("Toplam Tutar: "+ tutar);

    }
}