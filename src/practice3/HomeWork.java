package practice3;

public class HomeWork {
   protected static String company ="sony";
   int model =1234;

    public static void main(String[] args) {
        Object yearFromConstruction;
        HomeWork refVar = new HomeWork();
        refVar.printModelName();
        refVar.printSize();
        refVar.printCompany();




    }

    private String printCompany() {
        return company;
    }


    public static void printModelName(){
       String model = "1234";
        System.out.println(model);
        System.out.println(company);

    }


    public static String getCompany() {
        return company;

    }

    public void printSize() {
        System.out.println(20);
    }
}