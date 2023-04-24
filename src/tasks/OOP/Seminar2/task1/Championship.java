package tasks.OOP.Seminar2.task1;

public class Championship {
    public static void main(String[] args) {

        //Бегуны
        Runner[] runners = {
            new Cat("Барсик", 1500, 3),
            new Cat("Локи", 4000, 2),
            new Robot("R2D2", 658357, 0),
            new Robot("R3D4", 6557, 5),
            new Human("Вася", 3500, 1),
            new Human("Петя", 2500, 1),
        };



        // Препятствия
        Obstacle[] obstacles = {
            new Track(1200),
                new Wall(2),
                new Track(2000),
                new Wall(1),
                new Track(3000),
                new Wall(3)
        };

        for (Runner runner:runners) {
            for (Obstacle obstacle :obstacles) {
                if(obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength()))
                        break;
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight()))
                        break;
                }
            }

        }

    }
}
