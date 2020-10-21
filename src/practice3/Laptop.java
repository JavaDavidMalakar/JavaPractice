package practice3;

public class Laptop {
    // parameterization of construction

    // default constructor
    public Laptop(){

    }
        public static void main(String[]args){
            printHerName();
            Laptop refVar = new Laptop();
            refVar.printHisName();
            refVar.canntSeeYou();
        }
        public static void printHerName(){
            System.out.println("Dipu");
        }
    public void printHisName(){
        System.out.println("Dad");
    }
    public void canntSeeYou() {
        System.out.println("Zann");

    }

    public void printDetailsoftv() {
    }
}