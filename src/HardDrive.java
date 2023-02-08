public class HardDrive {
 private    int memory;

private int devided;

public HardDrive(int memory,int devided){
    this.devided=devided;
    this.memory=memory;
}

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setDevided(int devided) {
        this.devided = devided;
    }

    public int getDevided() {
        return devided;
    }

    public int getMemory() {
        return memory;
    }
}
