package tasks.OOP.Seminar2.task1;

/**
 * Базовый интерфейс - бегун
 */

public interface Runner {

    String getName();

    int getMaxRun();

    int getMaxJump();
    /**
     * Прыжок
     * @param height высота прыжка
     * @return результат прыжка (удалось ли перепрыгнуть препятствие или нет)
     */
    default boolean jump(int height) {
        if(height<= getMaxJump()){
            System.out.printf("%s успешно перепрыгнул через стену %d m.\n", getName(), height);
            return true;
        }else{

            System.out.printf("%s не смог перепрыгнуть через стену %d m. Остался на месте.\n", getName(), height);
            return false;
        }

    }

    /**
     * Бег
     * @param distance дистанция
     * @return результат бега (удалось ли пробежать дистанцию или нет)
     */

    default boolean run(int distance) {
        if(distance <= getMaxRun()){
            System.out.printf("%s успешно пробежал дистанцию %d m.\n", getName(), distance);
            return true;
        }else{

            System.out.printf("%s не смог пробежать дистанцию %d m.\n", getName(), distance);
            return false;
        }
    }


}
