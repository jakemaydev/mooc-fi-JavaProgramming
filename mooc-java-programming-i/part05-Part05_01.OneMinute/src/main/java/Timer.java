public class Timer {
    private ClockHand hundredthHand;
    private ClockHand secondHand;

    public Timer(){
        this.hundredthHand = new ClockHand(100);
        this.secondHand = new ClockHand(60);
    }

    public void advance(){
        hundredthHand.advance();
        if(hundredthHand.value() == 00){
            secondHand.advance();
        }
    }

    public String toString(){
        return secondHand + ":" + hundredthHand;
    }
}
