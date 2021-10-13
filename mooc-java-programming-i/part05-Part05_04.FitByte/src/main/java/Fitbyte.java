public class Fitbyte {
    private int age;
    private int restingHR;

    public Fitbyte(int age, int restingHR){
        this.age = age;
        this.restingHR = restingHR;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maxHR = (206.3 - (0.711 * age));
        return (maxHR - restingHR) * (percentageOfMaximum) + restingHR;
    }
}
