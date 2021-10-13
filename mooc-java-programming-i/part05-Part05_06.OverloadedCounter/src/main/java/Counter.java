public class Counter {
    private int counter;

    public Counter(int startValue){
        this.counter = startValue;
    }

    public Counter(){
        this.counter = 0;
    }

    public int value(){
        return counter;
    }

    public void increase(){
        counter++;
    }

    public void increase(int increaseBy){
        if(increaseBy > 0)
            counter += increaseBy;
    }

    public void decrease(){
        counter--;
    }

    public void decrease(int decreaseBy){
        if(decreaseBy > 0)
            counter -= decreaseBy;
    }



}
