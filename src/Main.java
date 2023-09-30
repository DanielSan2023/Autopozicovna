import com.autopozicovna.Auto;
import com.autopozicovna.Majitel;
import com.autopozicovna.PonukaAut;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // vytvorim object ponukaAut
        PonukaAut ponukaAut = new PonukaAut();
        Majitel zoznamMajitelov ;
        Scanner scanner = new Scanner(System.in);


        // pridam auto cez object newAuto do object ponukaAut
        ponukaAut.addAuto(new Auto("Skoda", 5000, 4.5, 50000,"545554"));
        ponukaAut.addAuto(new Auto("Volvo", 8250, 5.5, 150000,"505050"));
        ponukaAut.addAuto(new Auto("Renault", 4900, 6.5, 80000,"965487"));
        ponukaAut.addAuto(new Auto("BMW", 6500, 9.5, 250000,"452458"));

        // vypis ake vozidla su v ponuke
        System.out.println("Ponuka vozidiel:   " + LocalDate.now());
        ponukaAut.printAllAuta();
        System.out.println("Zadajte meno nového majitela vozidla:");
        String menoMajitela = scanner.nextLine();
        System.out.println("Zadaj názov vozidla, ktoré chce Pán/Pani "+menoMajitela + "  kúpiť:  ");
        String nazovVozidla = scanner.nextLine();

        // vypise ktore si vybral majitel
        ponukaAut.prepareAutoByNazov(nazovVozidla,menoMajitela);
        // vymaze vozidlo
        ponukaAut.removeAutoByNazov(nazovVozidla);
        System.out.println("Aktualizovaná ponuka vozidiel:   " + LocalDate.now());
        ponukaAut.printAllAuta();
        scanner.close();
        Majitel majitel1 = new Majitel("Majitel1", new Auto("Skoda", 5000,
                4.5, 50000,"545554"));

        Majitel majitel2 = new Majitel("Majitel2", new Auto("Volvo", 8250,
                5.5, 150000,"505050"));
        ponukaAut.pridajMajitela(majitel1);
        ponukaAut.pridajMajitela(majitel2);
        ponukaAut.vypisDatabazu();


    }
}
