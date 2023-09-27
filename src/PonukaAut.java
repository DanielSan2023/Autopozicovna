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
            System.out.println(pomocne.getName() +" (" + pomocne.getPrice() + ".-€ )");
        }
    }
    // Metoda pro odstranění auta ze seznamu na základě názvu
    public void removeAutoByNazov(String nazovVozidla) {
        ponuka.removeIf(auto -> auto.getName().equals(nazovVozidla));
    }

}
