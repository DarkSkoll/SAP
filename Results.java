public class Results{
    private Process process;
    private int startTime;
    private int endTime;
    private int output;
    private int response;
    private int waste;
    private float penalty;
    private int wait;

    public Results(Process process,int startTime){
        this.process = process;
        this.startTime = startTime;
        endTime = 0;
        output = 0;
        response = 0;
        waste = 0;
        penalty = 0;
        wait = 0;
    }

    public String getId(){
        return process.getId();
    }

    public int getDuration(){
        return process.getDuration();
    }

    public int getArriveTime(){
        return process.getArriveTime();
    }

    public int getPriority(){
        return process.getPriority();
    }

    public int getStartTime(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public int getOutput(){
        return output;
    }

    public int getResponse(){
        return response;
    }

    public int getWaste(){
        return waste;
    }

    public float getPenalty(){
        return penalty;
    }

    public int getWait(){
        return wait;
    }

    public void setEndTime(int endTime){
        this.endTime = endTime;
    }

    public void calculate(){
        output = endTime - startTime;
        response = endTime - process.getArriveTime();
        waste = response - process.getDuration();
        penalty = response / process.getDuration();
        wait = startTime - process.getArriveTime();
    }
}
