public class DZ_06 {
    public static void main(String[] args) {
        
        Laptop LenovoLaptop = new Laptop();
        LenovoLaptop.RAM = 4;
        LenovoLaptop.ROM = 500;
        LenovoLaptop.OS = "Windows_10";
        LenovoLaptop.colors = "white";
        LenovoLaptop.isCD_ROM = false;

        LenovoLaptop.printInfo();

        Laptop DellLaptop = new Laptop(6, 250);
        DellLaptop.isCD_ROM = true;
        DellLaptop.printInfo();
    }

}

class Laptop {
    Integer RAM;
    Integer ROM;
    String OS;
    String colors;
    Boolean isCD_ROM;

    void printInfo() {
        // System.out.printf("Laptop info: RAM = %d, ROM = %d, OS = %d, colors = %d, CD-ROM = %d", RAM, ROM, OS, colors, CD_ROM);
        System.out.println("Laptop info: RAM = " + RAM + ", ROM = " + ROM + ", OS = " + OS + ", colors = " + colors + ", CD-ROM = " + isCD_ROM);
    }

    /**
     * По умолчанию все поля заполнены null
     */
    Laptop(){
        RAM = null;
        ROM = null;
        OS = null;
        colors = null;
        isCD_ROM = null;

    }

    /**
     * Метод со стандартными значениями: ОС: windows 11, цвет: чёрный, привода нет
     * @param ram
     * @param rom
     */
    Laptop (Integer ram, Integer rom){
        RAM = ram;
        ROM = rom;
        OS = "Windows 11";
        colors = "black";
        isCD_ROM = false;


    }
}
