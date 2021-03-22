package pl.zzpj2021.solid.ocp.usa.solution;

public abstract class State {
    
    private final String stateCode;
    private int maxSpeed;

    public State(String stateCode, int maxSpeed) {
        this.stateCode = stateCode;
        this.maxSpeed = maxSpeed;
    }

    public String getStateCode() {
        return stateCode;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
