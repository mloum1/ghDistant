import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Algo {
    public static void main(String[] args) {
        Algo algo = new Algo();
        algo.initialiserFenetreWindow();
    }

    private void initialiserFenetreWindow() {
        JFrame fenetre = new JFrame(Constantes.HELLO_WORLD);

        fenetre.setSize(200, 200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(Constantes.HELLO_WORLD, JLabel.CENTER);

        label.setOpaque(true);
        label.setBackground(Color.YELLOW);

        fenetre.add(label);
        fenetre.setVisible(true);
    }
}
