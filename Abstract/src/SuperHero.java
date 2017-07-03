abstract class SuperHero {
    String superPowers[];
    SuperHero(){
        this.superPowers = new String[5];
        this.superPowers [0] = "FirstPOWER";
        this.superPowers [1] = "SecondPOWER";
        this.superPowers [2] = "ThirdPOWER";
        this.superPowers [3] = "FourthPOWER";
        this.superPowers [4] = "FifthPOWER";
    }
    void setSuperPower (String power, int element){
        this.superPowers [element] = power;
    }
    void setSuperPowers(String superPowers[]){
     this.superPowers = superPowers;
    }
    void printSuperPowers(){
        for (int i = 0; i < superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    abstract void displayPower();
}