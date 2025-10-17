package GraphicEngine;

public interface GraphicEngine {

    public void init(int w, int h);

    public void drawRectangle(int x, int y, int w, int h, Color stroke);
    public void drawFillRectangle(int x, int y, int w, int h, Color stroke, Color fill);

    public void drawEllipse(int x, int y, int w, int h, Color stroke);
    public void drawFillEllipse(int x, int y, int w, int h, Color stroke, Color fill);

    public Object loadImage(String path);

    public void drawImage(Object img, int x, int y, int w, int h);

    public int width();
    public int height();


}
