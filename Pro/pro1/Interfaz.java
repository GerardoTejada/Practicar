package pro1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz extends JFrame implements KeyListener {
    JButton bj1 = new JButton("Hola mundo");

    KeyListener k1;
    int x = 50, y = 50;
    double dx = 14.1, dy = 14.5;

    Interfaz() {
        super("Escuchadores de comandos");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initiComponent();
    }

    void initiComponent() {
        JPanel p = new JPanel();
        p.setLayout(null);
        this.getContentPane().add(p);
        p.addKeyListener(this);
        p.setFocusable(true);
        // Boton hola mundo
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g1 = (Graphics2D) g;
        g1.setColor(Color.ORANGE);
        g1.fillOval(x, y, 50, 50);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillRect(300, 300, 40, 40);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();

        if (KeyCode == KeyEvent.VK_LEFT) {
            x += -dx;
        }

        if (KeyCode == KeyEvent.VK_RIGHT) {
            x += dx;
        }

        if (KeyCode == KeyEvent.VK_UP) {
            y += -dy;
        }

        if (KeyCode == KeyEvent.VK_DOWN) {
            y += dy;
        }

        if (x > 780 || x <= 0) {
            return;
        }

        if (y >= 500 || y <= 0) {
            return;
        }

        if (x >= 253 && x < 340  && y >= 255 && y <= 340){
            System.out.println("Bloque rojo");
        }
        System.out.println(x+" "+y);
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.print("");
    }

}
