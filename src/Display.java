public class Display {
    private int diagonal;
    private String manufacturer;
    private String matrixType;

    public Display(int dioganal, String manufactor, String matrixType) {
        this.diagonal=dioganal;
        this.manufacturer=manufactor;
        this.matrixType=matrixType;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
