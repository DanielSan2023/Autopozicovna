package com.autopozicovna;

import java.util.Objects;

public class Auto {
    String name;
    int price;
    double spotreba;
    int najazdeneKm;
    String numberVin;


    public Auto(String name, int price, double spotreba, int najazdeneKm,String  numberVin) {
        this.name = name;
        this.price = price;
        this.spotreba = spotreba;
        this.najazdeneKm = najazdeneKm;
        this.numberVin = numberVin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpotreba() {
        return spotreba;
    }

    public void setSpotreba(double spotreba) {
        this.spotreba = spotreba;
    }

    public int getNajazdeneKm() {
        return najazdeneKm;
    }

    public void setNajazdeneKm(int najazdeneKm) {
        this.najazdeneKm = najazdeneKm;
    }

    public String  getNumberVin() {
        return numberVin;
    }

    public void setNumberVin(String  numberVin) {
        this.numberVin = numberVin;
    }


}
