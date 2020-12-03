public class Process{
    private String id;
    private int duration;
    private int arriveTime;
    private int priority;
    private int cpuTime;
    private int startTime;
    private int endTime;
    private float output;
    private float response;
    private float waste;
    private float penalty;
    private float wait;

    public Process(String id,float output,float response,float waste,float penalty,float wait){
        this.id = id;
        duration = 0;
        arriveTime = 0;
        priority = 0;
        cpuTime = 0;
        startTime = 0;
        endTime = 0;
        this.output = output;
        this.response = response;
        this.waste = waste;
        this.penalty = penalty;
        this.wait = wait;
    }

    public Process(String id,int priority,int duration,int arriveTime){
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

    public void setStartTime(int startTime){
        this.startTime = startTime;
    }

    public boolean isDone(){
        if(cpuTime == duration) return true;
        return false;
    }

    public void calculate(){
        output = endTime - startTime;
        response = endTime - arriveTime;
        waste = response - duration;
        penalty = response / duration;
        wait = startTime - arriveTime;
    }

    public void imprimir(){
        System.out.println("ID: "+id);
        System.out.println("Prioridad: "+priority);
        System.out.println("Duracion: "+duration);
        System.out.println("Llegada: "+arriveTime);
        System.out.println("Inicio: "+startTime);
        System.out.println("Finalización: "+endTime);
        System.out.println("Output: "+output);
        System.out.println("Response: "+response);
        System.out.println("Waste: "+waste);
        System.out.println("Penalty: "+penalty);
        System.out.println("Wait: "+wait);
    }

    public String toString(){
        return "ID: "+id+"\nPrioridad: "+priority+"\nDuracion: "+duration+"\nLlegada: "+arriveTime;
    }
}
