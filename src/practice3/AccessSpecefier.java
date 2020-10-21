package practice3;

public class AccessSpecefier {
    protected String name = "pnt";

    public static void main(String[] args) {
        displayName("Hassan",7);
    }
    public static void displayName(String name, int number){
        for(int counter = 1; counter <=number; counter++){
            System.out.println(name);

        }
    }





}


