package Exercise_6b;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Race monteCarlo=new Race("Montecarlo GP");
        monteCarlo.runRace();
        String result=monteCarlo.getResult();
        System.out.println(result);

    }
}