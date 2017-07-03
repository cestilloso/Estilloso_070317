public class AbstractDemo {
 public static void main(String[] args) {
        FlyingSuperHero fsh= new FlyingSuperHero();
        //fsh.displayPower();
        Spiderman sm= new Spiderman();
       // sm.displayPower();
        fsh.setSuperPower("New Power",  2);
        fsh.printSuperPowers();
        
    }
}
