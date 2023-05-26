package tasks.OOP.seminar6.lsp;

public class Program {
    // Тип S(Duck) будет подтипом Т(Bird) тогда и только тогда,
    // когда каждому объекту oS(duck1,duck2 ..) типа S соответствует некий объект oT(bird1,bird2..) типа T таким образом,
    // что для всех программ P(processFly),
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.
    public static void main(String[] args) {
        Bird bird1 = new Bird();// T
        Bird bird2 = new Bird();// T
        Bird bird3 = new Bird();// T

        Duck duck1 = new Duck();// S
        Duck duck2 = new Duck();// S
        Duck duck3 = new Duck(); // S
        Penguin penguin1 = new Penguin();

        processFly(bird1);
        processFly(bird2);
        processFly(bird3);


        processFly(duck1);
        processFly(duck2);
        processFly(duck3);
        processFly(penguin1);
    }

    public static void processFly(Bird bird){
        try {
            bird.fly();
        } catch (Exception e){
            System.out.printf("Птице не удалось полетать.");
        }

    }

}
