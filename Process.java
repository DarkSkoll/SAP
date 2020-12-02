public class Process{
    private String id;
    private int duration;
    private int arriveTime;
    private int priority;
    private int cpuTime;

    public Process(String id,int duration,int arriveTime,int priority){
        this.id = id;
        this.duration = duration;
        this.arriveTime = arriveTime;
        this.priority = priority;
        cpuTime = 0;
    }

    public String getId(){
        return id;
    }

    public int getDuration(){
        return duration;
    }

    public int getArriveTime(){
        return arriveTime;
    }

    public int getPriority(){
        return priority;
    }

    public int getcpuTime(){
        return cpuTime;
    }

    public void reset(){
        cpuTime = 0;
    }

    public void compute(){
        cpuTime++;
    }
}
