/**
 * Class Laptop - предназначен для добавления записей в список ноутбуков
 */
public class Laptop {
    String Brand;
    Integer RAM;
    Integer ROM;
    String OS;
    String colors;
    Boolean isCD_ROM;

    /**
     * Метод для вывода на печать в консоль всех параметров значения Laptop
     */
    void printInfo() {
        // System.out.printf("Laptop info: RAM = %d, ROM = %d, OS = %d, colors = %d,
        // CD-ROM = %d", RAM, ROM, OS, colors, CD_ROM);
        System.out.println("Laptop " + Brand + " info: RAM = " + RAM + "Gb, ROM = " + ROM + "Gb, OS = " + OS
                + ", colors = " + colors + ", CD-ROM = " + isCD_ROM);
    }

    /**
     * По умолчанию все поля заполнены null
     */
    Laptop() {
        this.Brand = null;
        this.RAM = 0;
        this.ROM = 0;
        this.OS = null;
        this.colors = null;
        this.isCD_ROM = false;
    }

    /**
     * Метод для быстрого полного создания записи
     * 
     * @param Brand
     * @param RAM
     * @param ROM
     * @param OS
     * @param colors
     * @param isCD_ROM
     */
    Laptop(String Brand, Integer RAM, Integer ROM, String OS, String colors, Boolean isCD_ROM) {
        this.Brand = Brand;
        this.RAM = RAM;
        this.ROM = ROM;
        this.OS = OS;
        this.colors = colors;
        this.isCD_ROM = isCD_ROM;
    }

    /**
     * Метод со стандартными значениями: ОС: windows 11, цвет: чёрный, привода нет
     * 
     * @param Brand
     * @param RAM
     * @param ROM
     */
    Laptop(String Brand, Integer RAM, Integer ROM) {
        this.Brand = Brand;
        this.RAM = RAM;
        this.ROM = ROM;
        OS = "Windows 11";
        colors = "black";
        isCD_ROM = false;

    }
}
