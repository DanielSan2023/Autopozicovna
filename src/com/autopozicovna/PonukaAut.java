package com.autopozicovna;

import java.util.ArrayList;
import java.util.List;

public class PonukaAut {

    //list ponuka
    List<Auto> ponuka = new ArrayList<>();

      // pridaj auto do ponuky
    public void addAuto(Auto newAuto){
        ponuka.add(newAuto);
    }
       // odober auto z ponuky

       //metoda vypise auto ,ktor0 s[ v ponuke List
    public void printAllAuta(){
        //System.out.println("Ponuka vozidiel :");
        for(Auto pomocne : ponuka){
            System.out.println(pomocne.getName() +" (" + pomocne.getPrice() + ".-€ )  "+ "Vin"+pomocne.getNumberVin());
        }
    }
    // Metoda pro odstranění auta ze seznamu na základě názvu
    public void removeAutoByNazov(String nazovVozidla) {
        ponuka.removeIf(auto -> auto.getName().equals(nazovVozidla));
    }

    public void prepareAutoByNazov(String nazovVozidla,String menoMajitela) {
        for (Auto auto : ponuka) {
            if (auto.getName().equals(nazovVozidla)) {
                System.out.println("Parametry auta s názvem " + nazovVozidla + ":");
                System.out.println("Název: " + auto.getName());
                System.out.println("Cena: " + auto.getPrice() + " €");
                System.out.println("Spotřeba: " + auto.getSpotreba() + " l/100km");
                System.out.println("Najeté kilometry: " + auto.getNajazdeneKm());
                System.out.println("Vin"+auto.getNumberVin());
                System.out.println("Je predané Pánovi/Pani:"+menoMajitela);
                return; // Ukončíme smyčku po nalezení odpovídajícího automobilu
            }
        }
        System.out.println("com.autopozicovna.Auto s názvem " + nazovVozidla + " nebylo nalezeno.");
    }
}
