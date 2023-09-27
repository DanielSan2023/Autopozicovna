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
    public void removeAuto(Auto autoToRemove){
        ponuka.remove(autoToRemove);
    }
       //metoda vypise auto ,ktor0 s[ v ponuke List
    public void printAllAuta(){
        System.out.println("Ponuka vozidiel :");
        for(Auto pomocne : ponuka){
            System.out.println(pomocne.getName() +" (" + pomocne.getPrice() + ".-€ )");
        }
    }


}
