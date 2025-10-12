package GraphicEngine;

import processing.core.PApplet;
import processing.core.PConstants;

public class ProcessingGraphicEngine implements GraphicEngine {

    private PApplet pApplet;

    public ProcessingGraphicEngine(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    @Override
    public void init(int w, int h) {
    }

    @Override
    public void drawRectangle(int x, int y, int w, int h, Color stroke) {
        //pApplet.noFill();
        pApplet.stroke(stroke.red(), stroke.green(), stroke.blue());

        pApplet.rectMode(PConstants.CENTER);

        pApplet.rect(x, y, w, h);
    }

    @Override
    public void drawFillRectangle(int x, int y, int w, int h, Color stroke, Color fill) {
        pApplet.fill(fill.red(), fill.green(), fill.blue());
        pApplet.stroke(stroke.red(), stroke.green(), stroke.blue());

        pApplet.rectMode(PConstants.CENTER);

        pApplet.rect(x, y, w, h);
    }

    @Override
    public void drawEllipse(int x, int y, int w, int h, Color stroke) {
        pApplet.noFill();
        pApplet.stroke(stroke.red(), stroke.green(), stroke.blue());

        pApplet.ellipse(x, y, w, h);
    }

    @Override
    public void drawFillEllipse(int x, int y, int w, int h, Color stroke, Color fill) {
        pApplet.fill(fill.red(), fill.green(), fill.blue());
        pApplet.stroke(stroke.red(), stroke.green(), stroke.blue());

        pApplet.ellipse(x, y, w, h);
    }

    @Override
    public Object loadImage(String path) {
        return null;
    }

    @Override
    public void drawImage(Object img, int x, int y, int w, int h) {

    }

    @Override
    public int width() {
        return pApplet.width;
    }

    @Override
    public int height() {
        return pApplet.height;
    }
}
