package Exercise_6b;

public class Car {
    private String stable;
    private Driver driver =new Driver();

    public Car(String stable, Driver driver){
        stable="ja";
        driver= driver;
    }
    public String getDetails(){
        return "a descriptive String of the object";
    }
    public void setStable(String stable) { this.stable=stable;}
    public String getStable() {return stable;}
}
