package lopVaDoiTuong;

public class StopWatch {
    private int startTime;
    private int endTime;

    public StopWatch() {

    }

    public StopWatch(int endTime) {
        this.startTime = (int) System.currentTimeMillis();
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public void start (){
        this.startTime = (int) System.currentTimeMillis();
    }
    public void end (){
        this.endTime = (int) System.currentTimeMillis();
    }
    public int getElapsedTime(){
        return endTime-startTime;
    }
}
