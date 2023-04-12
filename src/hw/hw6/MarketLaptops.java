package hw.hw6;

public class MarketLaptops {

    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public MarketLaptops(String name, int ram, int storageCap, String os, String colour, double diagonal){

        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }


    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n",
                this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MarketLaptops) {
            return this.name.equals(((MarketLaptops) obj).name) && this.ram == ((MarketLaptops) obj).ram
                    && this.storageCap == ((MarketLaptops) obj).storageCap && this.os.equals(((MarketLaptops) obj).os)
                    && this.colour.equals(((MarketLaptops) obj).colour) && this.diagonal == ((MarketLaptops) obj).diagonal;
        }
        return false;

    }

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }

}