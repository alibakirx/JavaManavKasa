import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlican = 5.00;
        double toplamTutar = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo olsun ?");
        armutKilo = input.nextInt();

        System.out.println("Elma kaç kilo olsun ?");
        elmaKilo = input.nextInt();

        System.out.println("Domates kaç kilo olsun ?");
        domatesKilo = input.nextInt();

        System.out.println("Muz kaç kilo olsun ?");
        muzKilo = input.nextInt();

        System.out.println("Patlıcan kaç kilo olsun ?");
        patlicanKilo = input.nextInt();

        toplamTutar = (armutKilo * armut) + (elmaKilo + elma) + (domatesKilo * domates) + (muz * muzKilo) + (patlican *patlicanKilo);
        System.out.println("Topla Tutar: " + toplamTutar);



    }
}