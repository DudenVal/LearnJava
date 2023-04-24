package hw.HwOOP2;

public class Cat {
    private String name;
    private int appetite;
    boolean full;

    public Cat(String name, int appetite) {
        if (name.isEmpty()){
            throw new RuntimeException("У кота должно быть имя!");
        } else{
            this.name = name;
        }
        if (appetite > 9) {
            this.appetite = appetite;
        }else{
            throw new RuntimeException("Аппетит меньше 9!");
        }
        this.full = false;
    }

    public Cat(String name) {
        this(name, 15);
    }
    public Cat(){
        this("Роберто", 15);
    }

    public boolean getFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        if (appetite <= plate.getFood() && !full){
            System.out.println(name + " ест...");
            plate.setFood(plate.getFood() - appetite);
            System.out.println(name + " съел! " + name + " наелся!");
            full = true;
        } else if (full) {
            System.out.println(name + " не голоден!");
        }else{
            System.out.println(name + " не может есть, потому что в тарелке недостаточно еды!");
            System.out.println(name + " будет кошмарить вас, пока вы не положите достаточно еды!!!!");
        }
    }

    public String getInfo(){
        if(full) return  name + " сыт!";
        else return name + " голоден!";
    }
}
