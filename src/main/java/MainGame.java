import javax.swing.JFrame;

public class MainGame {
    public static void main(String[] args) {
        JFrame window = new JFrame("My Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
