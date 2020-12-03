public class Results{
    private Process process;
    private int startTime;
    private int endTime;
    private float output;
    private float response;
    private float waste;
    private float penalty;
    private float wait;

    public Results(String name,float output,float response,float waste,float penalty,float wait){
        process = new Process(name);
        startTime = 0;
        endTime = 0;
        this.output = output;
        this.response = response;
        this.waste = waste;
        this.penalty = penalty;
        this.wait = wait;
    }

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

    public float getOutput(){
        return output;
    }

    public float getResponse(){
        return response;
    }

    public float getWaste(){
        return waste;
    }

    public float getPenalty(){
        return penalty;
    }

    public float getWait(){
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
