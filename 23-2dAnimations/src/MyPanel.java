import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 20;
    int yVelocity = 10;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        enemy = new ImageIcon("ampul2.gif").getImage();
        backgroundImage = new ImageIcon("turkey_invaders_background.gif").getImage();
        this.setBackground(Color.black);
        timer = new Timer(10,this); // do that every 1000 ms, 
        timer.start();

    }

    public void paint(Graphics g){
        super.paint(g); // paint background
        Graphics g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0){
            xVelocity = -xVelocity;
        }
        x = x + xVelocity;
        if(y >= PANEL_HEIGHT-enemy.getWidth(null) || y < 0){
            yVelocity = -yVelocity;
        }
        y = y + yVelocity;
        repaint();
    }   
}