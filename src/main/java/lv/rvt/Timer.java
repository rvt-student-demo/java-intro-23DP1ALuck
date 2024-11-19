package lv.rvt;

public class Timer {
    private ClockHand seconds;
    private ClockHand houndrethOfSeconds;
    public Timer(){
        this.seconds = new ClockHand(60);
        this.houndrethOfSeconds = new ClockHand(100);
    }
    public void advance(){
        this.houndrethOfSeconds.advance();
        if(houndrethOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }
    public String toString(){
        return seconds + ":" + houndrethOfSeconds;
    }
}
