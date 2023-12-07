package web.model;

public class Car {

    private String model;
    private int series;
    private int volume;

    public Car(String model, int series, int volume) {
        this.model = model;
        this.series = series;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", hP=" + volume +
                '}';
    }
}