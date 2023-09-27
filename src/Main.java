public class Main {
    public static void main(String[] args) {
        // vytvorim object ponukaAut
        PonukaAut ponukaAut = new PonukaAut();

        // pridam auto cez object newAuto do object ponukaAut
        ponukaAut.addAuto(new Auto("Skoda",5000,4.5,50000));
        ponukaAut.addAuto(new Auto("Volvo",8250,5.5,150000));
        ponukaAut.addAuto(new Auto("Renault",4900,6.5,80000));
        ponukaAut.addAuto(new Auto("BMW",6500,9.5,250000));


        // vypis ake vozidla su v ponuke
        ponukaAut.printAllAuta();
         //odober auto z ponuky
        ponukaAut.removeAuto(new Auto("Volvo",8250,5.5,150000));

        ponukaAut.printAllAuta();

    }
}