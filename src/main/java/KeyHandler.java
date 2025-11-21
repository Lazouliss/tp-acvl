import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    
    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // Unused method
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        movementState(true, code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        movementState(false, code);
    }

    private void movementState(boolean state, int code) {
        // ZQSD or Arrow Keys
        switch (code) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_Z:
                upPressed = state;
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                downPressed = state;
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_Q:
                leftPressed = state;
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                rightPressed = state;
                break;
            default:
                System.out.println("WARNING: Key not mapped: " + code);
                break;
        }
    }
}