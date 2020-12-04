package cwiczenia5;

public class Car {
    private String model;
    private float pojemnoscSilika;

    public Car(String model, float pojemnoscSilika){
        this.model = model;
        this.pojemnoscSilika = pojemnoscSilika;
    }

    public String getModel(){
        return "Moodel:" + model;
    }
    public void setModel(String model){
        this.model = model;
    }
}
