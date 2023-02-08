public class RAM {
 private    int volume ;
 private  String  manufactor;

public RAM(int volume,String manufactor){
    this.manufactor=manufactor;
    this.volume=volume;
}

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public int getVolume() {
        return volume;
    }

    public String getManufactor() {
        return manufactor;
    }
}
