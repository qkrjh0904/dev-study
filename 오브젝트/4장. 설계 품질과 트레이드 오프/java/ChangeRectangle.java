public class ChangeRectangle {
    void changeRectangle(Rectangle rectangle, int multiple){
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setBottom(rectangle.getBottom() * multiple);
    }
}
