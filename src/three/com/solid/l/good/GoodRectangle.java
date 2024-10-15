package three.com.solid.l.good;

public class GoodRectangle implements Shape{
    private int width;
    private int height;

    public GoodRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
