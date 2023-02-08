public class USBports {

  private   double portType;
private     int id;

public USBports(double portType,int id){

    this.portType=portType;
    this.id=id;

}

    public void setPortType(double portType) {
        this.portType = portType;
    }

    public double getPortType() {
        return portType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
