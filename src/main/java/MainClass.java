

 interface Vachel {
    double getSpeed();
}

class Subaru implements Vachel {

     @Override
     public double getSpeed() {
         return 200;
     }
 }

 interface VachelAdapter {
     double getSpeed();
 }

class VachelAdapterImpl implements VachelAdapter {
     private Vachel luxuryCars;

    public VachelAdapterImpl(Vachel vachel) {
        this.luxuryCars=vachel;
    }


    @Override
     public double getSpeed() {
         return adaptSpeed(luxuryCars.getSpeed());
     }

     private double adaptSpeed(double mph) {
         return mph * 1.5;
     }
 }

public class MainClass {

    public static void main(String[] args) {
        Vachel subaru = new Subaru();
        VachelAdapter vachelAdapter = new VachelAdapterImpl(subaru);

        System.out.println(subaru.getSpeed());
        System.out.println(vachelAdapter.getSpeed());
    }
}
