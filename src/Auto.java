import java.util.Objects;

public class Auto {
    String name;
    int price;
    double spotreba;
    int najazdeneKm;


    public Auto(String name, int price, double spotreba, int najazdeneKm) {
        this.name = name;
        this.price = price;
        this.spotreba = spotreba;
        this.najazdeneKm = najazdeneKm;
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

    // !!!!!!!!!  POZOR!!!!!!!!!!!!!!!!
    //   metody porovnanvaju ci su objecty rovnake aby ich mohol odstranit
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return price == auto.price &&
                Double.compare(auto.spotreba, spotreba) == 0 &&
                najazdeneKm == auto.najazdeneKm &&
                Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, spotreba, najazdeneKm);
    }
}
