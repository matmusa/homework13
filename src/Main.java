public class Main {
    public static void main(String[] args) {

        Display display = new Display(18, "Asus", "Full HD");
        Brand brand = new Brand("Asus \n" +
                "Laptop 15 X509FL :");
        Color color = new Color("Black");
        HardDrive hardDrive = new HardDrive(1000, 2);
        RAM ram = new RAM(8, "Intel core3");
        VideoCard videoCard = new VideoCard(250);
        USBports usBports = new USBports(2.0, 2749943);
        Keyboard keyboard=new Keyboard(false,false);

        System.out.println(
                "\nVivobook"+
                        "\nDisplay :"+display.getDiagonal()+
                "\nBrand :"+brand.getBrand()+
                "\nColor :"+color.getColor()+
                "\nHard drive memory  :"+hardDrive.getMemory()+
                "\nHard drive devided :"+hardDrive.getDevided()+
                "\nRAM volume :"+ram.getVolume()+
                "\nRAM manufactor :"+ram.getManufactor()+
                "\nVideo card  :"+videoCard.getVideoCard()+
                "\nUSB port type :"+usBports.getPortType()+
                "\n USB port id  :"+usBports.getId()+
                 "\n Keyboard highliants :"+keyboard.isHighlights()+
                 "\n Keyboard addtional :"+keyboard.isAdditional());


    }
}