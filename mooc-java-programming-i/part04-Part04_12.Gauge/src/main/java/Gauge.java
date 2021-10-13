public class Gauge {
    private int value;

    public Gauge(){
        value = 0;
    }

    public void increase(){
        value++;

        if(value > 5)
            value = 5;
    }

    public void decrease(){
        value--;

        if(value < 0)
            value = 0;
    }

    public int value(){
        return value;
    }

    public boolean full(){
        return value == 5;
    }
}
