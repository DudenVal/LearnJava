package tasks.OOP.seminar6.ocp1;

public class SimpleDrawer {

    public  void Draw(Shape shape){
        switch (shape.getShapeType()){
            case Circle -> {
                drawCircle(shape);
            }
            case Square -> {
                drawSquare(shape);
            }
        }
    }
    public void drawSquare(Shape shape){
        ///...
    }
    public void drawCircle(Shape shape){
        ///...
    }

}
