package GraphicEngine;

public class Color {
    private int r, g, b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int red() {
        return r;
    }

    public int green() {
        return g;
    }

    public int blue() {
        return b;
    }

    public static Color RED = new Color(255, 0, 0);
    public static Color WHITE = new Color(255, 255, 255);
    public static Color BLACK = new Color(0, 0, 0);
    public static Color GREEN = new Color(0, 255, 0);

    public static Color BLUE = new Color(0, 0, 255);




}
