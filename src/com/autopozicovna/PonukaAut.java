package com.autopozicovna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PonukaAut {

    //list ponuka
    List<Auto> ponuka = new ArrayList<>();
    Map<String, Majitel> majitelPodlaVIN = new HashMap<>();

    public PonukaAut() {
    }

    public PonukaAut(List<Auto> ponuka, Map<String, Majitel> majitelPodlaVIN) {
        this.ponuka = ponuka;
        this.majitelPodlaVIN = majitelPodlaVIN;
    }


    public void pridajMajitela(Majitel majitel) {
        majitelPodlaVIN.put(majitel.getAuto().getNumberVin(), majitel);
    }

    // pridaj auto do ponuky
    public void addAuto(Auto newAuto) {
        ponuka.add(newAuto);
    }


    //metoda vypise auto ,ktor0 s[ v ponuke List
    public void printAllAuta() {
        //System.out.println("Ponuka vozidiel :");
        for (Auto pomocne : ponuka) {
            System.out.println(pomocne.getName() + " (" + pomocne.getPrice() + ".-€ )  " + "Vin" + pomocne.getNumberVin());
        }
    }

    // Metoda pro odstranění auta ze seznamu na základě názvu
    public void removeAutoByNazov(String nazovVozidla) {

        ponuka.removeIf(auto -> auto.getName().equals(nazovVozidla));
    }

    public void prepareAutoByNazov(String nazovVozidla, String menoMajitela) {
        for (Auto auto : ponuka) {
            if (auto.getName().equals(nazovVozidla)) {
                System.out.println("Parametry auta s názvem " + nazovVozidla + ":");
                System.out.println("Název: " + auto.getName());
                System.out.println("Cena: " + auto.getPrice() + " €");
                System.out.println("Spotřeba: " + auto.getSpotreba() + " l/100km");
                System.out.println("Najeté kilometry: " + auto.getNajazdeneKm());
                System.out.println("Vin" + auto.getNumberVin());
                System.out.println("Je predané Pánovi/Pani:" + menoMajitela);
                return; // Ukončíme smyčku po nalezení odpovídajícího automobilu
            }
        }
        System.out.println("com.autopozicovna.Auto s názvem " + nazovVozidla + " nebylo nalezeno.");
    }
    public void vypisDatabazu() {
        for (Map.Entry<String, Majitel> entry : majitelPodlaVIN.entrySet()) {
            String vin = entry.getKey();
            Majitel majitel = entry.getValue();
            System.out.println("VIN: " + vin);
            System.out.println("Majitel: " + majitel.getMenoMajitela()); // Přístup k jménu majitele
            Auto auto = majitel.getAuto();
            System.out.println("Auto: " + auto.getName());
            System.out.println("Cena: " + auto.getPrice() + " €");
            System.out.println("Spotřeba: " + auto.getSpotreba() + " l/100km");
            System.out.println("Najeté kilometry: " + auto.getNajazdeneKm());
            System.out.println(); // Oddělení záznamů
        }
    }
}
